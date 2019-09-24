#include <jni.h>
#include <string>
#include "Store.h"


static Store store;

extern "C" JNIEXPORT jint JNI_OnLoad(JavaVM *vm, void *reverved) {
    store.length;
    return JNI_VERSION_1_6;
}

extern "C" JNIEXPORT jint JNICALL
Java_com_weber_testc_lib_Clib_getSizeStore(JNIEnv *env,
                                           jobject) {
    return store.length;
}