#include <jni.h>
#include <string>
#include "Store.h"


static StoreEntry store;
extern "C" JNIEXPORT jstring JNICALL

Java_com_weber_testc_lib_Clib_init(
        JNIEnv *env,
        jobject) {
    store = 0
    std::string hello = "init key-value store";
    return env->NewStringUTF(hello.c_str());
}
