/*
Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this
list of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
#include <mdsobjects.h>
using namespace MDSplus;
#include <sys/time.h>
#include <unistd.h>

#include "FLIRSC65X.h"
#include <cammdsutils.h>
#include <camstreamutils.h>

#include "flirutils.h"   //flir radiometric conversion
#include "fff.h"


#define USETHECAMERA  //this let to use the camera or if not defined to read data from a pulse file.


int main(int argc, char **argv )
{
  if((argv[1]==NULL) || (argv[2]==NULL) || (argv[3]==NULL))   // argv[4] is OPTIONAL
  { 
	printf("Please insert: 1)tree name 2)shot number 3)number of frame to acquire 4) Streaming Port (OPTIONAL)\n"); 
	exit(0); 
  }

//MDSPLUS
  int res;
  void *treePtr;
  res=camOpenTree(argv[1], atoi( argv[2] ), &treePtr);
  if(res==-1)
  {
    printf("Error opening tree...\n"); 
	exit(0); 
  }

  Tree *tree; 
  TreeNode *node;
  TreeNode *nodeMeta;
  int dataNid;

  try
  {
    tree = (Tree *)treePtr;
    node=tree->getNode((char *)"\\CAMERAS::TOP:IRCAM_1:FRAMES");		
    nodeMeta=tree->getNode((char *)"\\CAMERAS::TOP:IRCAM_1:FRAMES_METAD");  	
    dataNid=node->getNid();						//Node id to save the acquired frames
  }catch ( MdsException *exc )
    { std::cout << "ERROR reading data" << exc->what() << "\n"; }

  printf("frame node path: %s\n", node->getPath());
//MDSPLUS END



#ifndef USETHECAMERA
/*read frame and metadata from stored pulse file and use Radiometric Conversion*/

	  Array *frameArray;
	  Array *frameArrayMeta;
	  int *shape;
	  int *shapeMeta;
	  int nEle = 3;

	  Data  *frameData;
	  Data  *frameDataMeta;
	  short *framePtr; 
	  char *framePtrMeta; 

	  try
	  {
	     frameArray = node->getSegment(0);	//idx
	     frameArrayMeta = nodeMeta->getSegment(0);	//idx

	     shape = (frameArray)->getShape(&nEle); //shape[0]=numframe=1 shape[1]=numbyte
	     shapeMeta = (frameArrayMeta)->getShape(&nEle); //shape[0]=numframe=1 shape[1]=numbyte

	     int numbytes = shape[1];
	     int numframes = shape[0];

	     frameData  = (frameArray)->getElementAt(0);
	     frameDataMeta  = (frameArrayMeta)->getElementAt(0);

	     int dataDims[3];
	     int dataDimsMeta[3];
	     framePtr   = (frameData)->getShortArray(dataDims);
	     framePtrMeta   = (frameDataMeta)->getByteArray(dataDimsMeta);
	   }
	   catch ( MdsException *exc )
	   { std::cout << "ERROR reading data" << exc->what() << "\n"; }


	FLIR_SC65X *FlirCam;
	FlirCam = new FLIR_SC65X();  //open without ip adress because we not use a phisical camera!
	printf("Radiometric Conversion Started\n");
	flirRadiometricConv(framePtr, 640, 480, framePtrMeta);
	//flirRadiometricConvPar(framePtr, 640, 480, framePtrMeta, 293.15, 0.05, 0.5, 293.15, 60.0);
	printf("Radiometric Conversion Ended\n");

#endif


#ifdef USETHECAMERA

//INIT STREAMING
  int kSockHandle=-1;  //MUST BE -1 THE FIRST TIME !!!
  int i=1;
  int canStream=-1;

if(argv[4]!=NULL)
{

  while(canStream==-1 && i<=5) //try 5 times to open the connection
  { 
    canStream=camOpenTcpConnection((const char *)"127.0.0.1", atoi(argv[4]), &kSockHandle, 640, 480, CSU_PIX_FMT_GRAY16);
	sleep(1);
	i++;
  }
  if(canStream==0)
  { 
    printf("Streaming OK!\n");  
  }
  else
  { 
    printf("CANNOT Streaming!\n"); 
  }

}    
//END STREAMING


//FLIR

    FLIR_SC65X *FlirCam;
    FlirCam = new FLIR_SC65X("169.254.76.254");   //vecchia 169.254.169.249        //nuova 169.254.76.254   //192.168.50.20
    if(!FlirCam->checkLastOp())
    {
		printf("Unable to connect!!!\n");
		exit(0);
	}
	else
    {
		printf("Successfully connected...\n");
	}	

	int skipFrame = 0;
	int width=0;
	int height=0;
	int payloadSize=0;
	int x,y=0;

	FlirCam->setObjectParameters(291.15, 292.15, 1.0, 0.95, 0.5, 294.15, 1.0, 0.0);
	FlirCam->setExposureMode(external_mode);	 //internal_mode  external_mode
	FlirCam->setFrameRate(fps_25, &skipFrame);  //200 100 50 25 12 6 3
	FlirCam->setIrFormat(radiometric);  		 //radiometric linear10mK linear100mK
	FlirCam->setMeasurementRange(2);
	//FlirCam->setReadoutArea(0, 0, 400, 200);  //NOT TO USE. setFrameRate set also ReadoutArea! 
	FlirCam->getReadoutArea(&x, &y, &width, &height);
	printf("Start x:%d Start y:%d Width:%d Height:%d\n", x, y, width, height);

	printf("\nGETTING ALL CAMERA PARAMETERS: start\n");
//	FlirCam->printAllParameters();
	printf("\nGETTING ALL CAMERA PARAMETERS: end\n\n");

    printf("TEST OF FOCUS POSITION.\n");              
    int focusPos = 0;  
    FlirCam->getFocusAbsPosition(&focusPos);
    printf("Current Focus position: %d\n", focusPos);
    focusPos=37;
    printf("Try to set focus position @: %d\n", focusPos);
  //  FlirCam->setFocusAbsPosition(focusPos);
    FlirCam->getFocusAbsPosition(&focusPos);
    printf("New Focus position: %d\n", focusPos);               

                
	FlirCam->startAcquisition(&width, &height, &payloadSize); 

   	int status;
	void *metaData;
	void *frame;
    void *frame8bit;
    int frameNumber = 0;
    struct timeval tv;
    int64_t timeStamp;

   	frame=malloc(width*height*sizeof(short));
	frame8bit=malloc(width*height*sizeof(char));
	metaData=malloc(payloadSize-(width*height*sizeof(short)));

	printf("Executing auto calibration and auto focus...\n");
	FlirCam->setCalibMode(0);
	FlirCam->executeAutoCalib();
   //     FlirCam->executeAutoFocus();

    for(int i=1; i<=atoi(argv[3]); i++)  //acquire i=argv[3] frames
    { 
      frameNumber++;
      FlirCam->getFrame(&status, frame, metaData);  
      gettimeofday(&tv, NULL); 				  
      timeStamp = ((tv.tv_sec)*1000) + ((tv.tv_usec)/1000); // timeStamp [ms]
      switch(status)
      {		 
	 	case 1: printf("get frame %d complete @ %ld\n", frameNumber, timeStamp); break;
	 	case 2: printf("get frame %d incomplete @ %ld\n", frameNumber, timeStamp); break;
	 	case 3: printf("get frame %d timeout @ %ld\n", frameNumber, timeStamp); break;
	 	case 4: printf("get frame %d complete+triggered @ %ld\n", frameNumber, timeStamp); break;
      }

      if(status==1 or status==4)  
      {  
		 //SAVE FRAME IN MDSPLUS

/*	     res=camSaveFrame(frame, width, height, &timeStamp, 14, treePtr, dataNid, -1, frameNumber);
    	 if(res==-1)
   		 {
       		printf("Error in 'camSaveFrame'...\n"); 
     	 }
		 else
   		 {
       		printf("Frame saved...\n"); 
     	 }
*/
		 //STREAMING
		 if(skipFrame==0) printf("ERROR SKIPFRAME=0\n");
		 int sendFrame = i % skipFrame;
		 if( canStream==0 and sendFrame==0 )
   		 {
		   //streaming is set to 640 x 480 in "camOpenTcpConnection". 
		   //It must be changed to prevent strange image transmission!
		   unsigned int lowLim = 0;
		   unsigned int highLim = 32000;

		   camFrameTo8bit((unsigned short *)frame, 640, 480, CSU_PIX_FMT_GRAY16, (unsigned char *)frame8bit, 1, &lowLim, &highLim, 2000, 62000);
	//	   printf("LowLim:%d HighLim:%d\n",lowLim, highLim);
		   camSendFrameOnTcp(&kSockHandle, width, height, frame8bit);
     	 }      		 

	  }		

   }//for
	
   if(kSockHandle!=-1) camCloseTcpConnection(&kSockHandle); //close streaming

   FlirCam->setCalibMode(1); //auto calib
   FlirCam->stopAcquisition();
   delete FlirCam;

#endif

}
