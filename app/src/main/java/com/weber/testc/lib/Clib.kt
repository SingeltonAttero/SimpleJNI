package com.weber.testc.lib


object Clib {
    init {
        System.loadLibrary("native-lib")
    }

    external fun getSizeStore(): Int
    external fun getText(): String
    external fun setText(key: String, value: String): String

}