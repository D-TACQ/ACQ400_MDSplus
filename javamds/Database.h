/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class Database */

#ifndef _Included_Database
#define _Included_Database
#ifdef __cplusplus
extern "C" {
#endif


  /*
 * Class:     Database
 * Method:    open
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_Database_open
  (JNIEnv *, jobject);

/*
 * Class:     Database
 * Method:    openNew
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_Database_openNew
  (JNIEnv *, jobject);

/*
 * Class:     Database
 * Method:    write
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_Database_write
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    close
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_Database_close
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    quit
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_Database_quit
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    getData
 * Signature: (LNidData;I)LData;
 */
JNIEXPORT jobject JNICALL Java_Database_getData
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    evaluateData
 * Signature: (LNidData;I)LData;
 */
JNIEXPORT jobject JNICALL Java_Database_evaluateData
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    evaluateSimpleData
 * Signature: (LData;I)LData;
 */
JNIEXPORT jobject JNICALL Java_Database_evaluateSimpleData
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    putData
 * Signature: (LNidData;LData;I)V
 */
JNIEXPORT void JNICALL Java_Database_putData
  (JNIEnv *, jobject, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    putRow
 * Signature: (LNidData;LData;JI)V
 */
JNIEXPORT void JNICALL Java_Database_putRow
  (JNIEnv *, jobject, jobject, jobject, jlong, jint);

/*
 * Class:     Database
 * Method:    getInfo
 * Signature: (LNidData;I)LNodeInfo;
 */
JNIEXPORT jobject JNICALL Java_Database_getInfo
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    setTags
 * Signature: (LNidData;[Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_Database_setTags
  (JNIEnv *, jobject, jobject, jobjectArray, jint);

/*
 * Class:     Database
 * Method:    getTags
 * Signature: (LNidData;I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_Database_getTags
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    renameNode
 * Signature: (LNidData;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_Database_renameNode
  (JNIEnv *, jobject, jobject, jstring, jint);

/*
 * Class:     Database
 * Method:    addNode
 * Signature: (Ljava/lang/String;II)LNidData;
 */
JNIEXPORT jobject JNICALL Java_Database_addNode
  (JNIEnv *, jobject, jstring, jint, jint);

/*
 * Class:     Database
 * Method:    setSubtree
 * Signature: (LNidData;I)V
 */
JNIEXPORT void JNICALL Java_Database_setSubtree
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    startDelete
 * Signature: ([LNidData;I)[LNidData;
 */
JNIEXPORT jobjectArray JNICALL Java_Database_startDelete
  (JNIEnv *, jobject, jobjectArray, jint);

/*
 * Class:     Database
 * Method:    executeDelete
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_Database_executeDelete
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    getSons
 * Signature: (LNidData;I)[LNidData;
 */
JNIEXPORT jobjectArray JNICALL Java_Database_getSons
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    getMembers
 * Signature: (LNidData;I)[LNidData;
 */
JNIEXPORT jobjectArray JNICALL Java_Database_getMembers
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    isOn
 * Signature: (LNidData;I)Z
 */
JNIEXPORT jboolean JNICALL Java_Database_isOn
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    setOn
 * Signature: (LNidData;ZI)V
 */
JNIEXPORT void JNICALL Java_Database_setOn
  (JNIEnv *, jobject, jobject, jboolean, jint);

/*
 * Class:     Database
 * Method:    resolve
 * Signature: (LPathData;I)LNidData;
 */
JNIEXPORT jobject JNICALL Java_Database_resolve
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    setDefault
 * Signature: (LNidData;I)V
 */
JNIEXPORT void JNICALL Java_Database_setDefault
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    getDefault
 * Signature: (I)LNidData;
 */
JNIEXPORT jobject JNICALL Java_Database_getDefault
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    addDevice
 * Signature: (Ljava/lang/String;Ljava/lang/String;I)LNidData;
 */
JNIEXPORT jobject JNICALL Java_Database_addDevice
  (JNIEnv *, jobject, jstring, jstring, jint);

/*
 * Class:     Database
 * Method:    doAction
 * Signature: (LNidData;I)I
 */
JNIEXPORT jint JNICALL Java_Database_doAction
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    doDeviceMethod
 * Signature: (LNidData;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_Database_doDeviceMethod
  (JNIEnv *, jobject, jobject, jstring, jint);

/*
 * Class:     Database
 * Method:    getWild
 * Signature: (II)[LNidData;
 */
JNIEXPORT jobjectArray JNICALL Java_Database_getWild
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     Database
 * Method:    create
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_Database_create
  (JNIEnv *, jobject, jint);

/*
 * Class:     Database
 * Method:    saveContext
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_Database_saveContext
  (JNIEnv *, jobject);

/*
 * Class:     Database
 * Method:    restoreContext
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_Database_restoreContext
  (JNIEnv *, jobject, void *);

/*
 * Class:     Database
 * Method:    getCurrentShot
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_Database_getCurrentShot
  (JNIEnv *, jobject, jstring);

/*
 * Class:     Database
 * Method:    setCurrentShot
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_Database_setCurrentShot
  (JNIEnv *, jobject, jstring, jint);

/*
 * Class:     Database
 * Method:    getOriginalPartName
 * Signature: (LNidData;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_Database_getOriginalPartName
  (JNIEnv *, jobject, jobject);

/*
 * Class:     Database
 * Method:    setFlags
 * Signature: (LNidData;I)V
 */
JNIEXPORT void JNICALL Java_Database_setFlags
  (JNIEnv *, jobject, jobject, jint);

/*
 * Class:     Database
 * Method:    setEvent
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_Database_setEvent
  (JNIEnv *, jobject, jstring);

/*
 * Class:     Database
 * Method:    getMdsMessage
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_Database_getMdsMessage
  (JNIEnv *, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif
