#include "treeshrp.h"
#include <string.h>

#ifdef _big_endian
#define LoadShort(in,outp) (outp)[0] = ((char *)&in)[1]; (outp)[1] = ((char *)&in)[0]
#define LoadInt(in,outp)   (outp)[0] = ((char *)&in)[3]; (outp)[1] = ((char *)&in)[2]; \
                           (outp)[2] = ((char *)&in)[1]; (outp)[3] = ((char *)&in)[0]
#else
#define LoadShort(in,outp) (outp)[0] = ((char *)&in)[0]; (outp)[1] = ((char *)&in)[1]
#define LoadInt(in,outp)   (outp)[0] = ((char *)&in)[0]; (outp)[1] = ((char *)&in)[1]; \
                           (outp)[2] = ((char *)&in)[2]; (outp)[3] = ((char *)&in)[3]
#endif

void TreeSerializeNciOut(NCI *in, char *out)
{
  char *ptr = out;
  LoadInt(in->flags,ptr);                           ptr += 4;
  *ptr = in->flags2;                                ptr += 1;
                                                    ptr += 1;
  LoadInt(in->time_inserted[0],ptr);                ptr += 4;
  LoadInt(in->time_inserted[1],ptr);                ptr += 4;
  LoadInt(in->owner_identifier,ptr);                ptr += 4;
  *ptr = in->class;                                 ptr += 1;
  *ptr = in->dtype;                                 ptr += 1;
  LoadInt(in->length,ptr);                          ptr += 4;
                                                    ptr += 1;
  LoadInt(in->status,ptr);                          ptr += 4;
  if (in->flags2 & NciM_DATA_IN_ATT_BLOCK)
  {
    *ptr = in->DATA_INFO.DATA_IN_RECORD.element_length;     ptr += 1;
    memcpy(ptr, in->DATA_INFO.DATA_IN_RECORD.data,11);
  }
  else if (in->flags2 & NciM_ERROR_ON_PUT)
  {
    LoadInt(in->DATA_INFO.ERROR_INFO.error_status,ptr);  ptr += 4;
    LoadInt(in->DATA_INFO.ERROR_INFO.stv,ptr);
  }
  else
  {
    *ptr = in->DATA_INFO.DATA_LOCATION.file_level;        ptr += 1;
    *ptr = in->DATA_INFO.DATA_LOCATION.file_version;      ptr += 1;
    memcpy(ptr, in->DATA_INFO.DATA_LOCATION.rfa, 6);      ptr += 6;
    LoadInt(in->DATA_INFO.DATA_LOCATION.record_length,ptr);
  }
}

void TreeSerializeNciIn(char *in, NCI *out)
{
  char *ptr = in;
  out->flags = swapint(ptr);                                              ptr += 4;
  out->flags2 = *ptr;                                                     ptr += 1;
                                                                          ptr += 1;
  out->time_inserted[0] = swapint(ptr);                                   ptr += 4;
  out->time_inserted[1] = swapint(ptr);                                   ptr += 4;
  out->owner_identifier = swapint(ptr);                                   ptr += 4;
  out->class = *ptr;                                                      ptr += 1;
  out->dtype = *ptr;                                                      ptr += 1;
  out->length = swapint(ptr);                                             ptr += 4;
                                                                          ptr += 1;
  out->status = swapint(ptr);                                             ptr += 4;
  if (out->flags2 & NciM_DATA_IN_ATT_BLOCK)
  {
    out->DATA_INFO.DATA_IN_RECORD.element_length = *ptr;                  ptr += 1;
    memcpy(out->DATA_INFO.DATA_IN_RECORD.data,ptr,11);
  }
  else if (out->flags2 & NciM_ERROR_ON_PUT)
  {
    out->DATA_INFO.ERROR_INFO.error_status = swapint(ptr);                ptr += 4;
    out->DATA_INFO.ERROR_INFO.stv = swapint(ptr);                         ptr += 4;
  }
  else
  {
    out->DATA_INFO.DATA_LOCATION.file_level = *ptr;                       ptr += 1;
    out->DATA_INFO.DATA_LOCATION.file_version = *ptr;                     ptr += 1;
    memcpy(out->DATA_INFO.DATA_LOCATION.rfa,ptr,6);                       ptr += 6;
    out->DATA_INFO.DATA_LOCATION.record_length = swapint(ptr);
  }
}
    
