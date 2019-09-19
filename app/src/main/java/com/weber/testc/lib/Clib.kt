package com.weber.testc.lib


object Clib {
    init {
        System.loadLibrary("native-lib")
    }

    external fun stringFromJNI(): String
}