#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_weber_testc_lib_Clib_stringFromJNI(
        JNIEnv *env,
        jobject) {
    std::string hello = "new C++ hello world";
    return env->NewStringUTF(hello.c_str());
}
