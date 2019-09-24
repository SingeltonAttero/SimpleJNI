package com.weber.testc

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.Test
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        CoroutineScope(EmptyCoroutineContext).launch {
            doSomething("MainScope")
        }
    }

    private suspend fun doSomething(name: String) = coroutineScope {
        launch {
            delay(2000)
            println("test delay 2000 $name")
        }
        println("go new $name")
    }
}
