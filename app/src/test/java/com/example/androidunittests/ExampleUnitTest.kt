package com.example.androidunittests

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun TestXhosa(){
        val w = Words()
        val expected = "Mholo"
        val actual = w.Xhosa()
        assertEquals(expected,actual)
    }

    @Test
    fun TestEnglish(){
        val w = Words()
        val expected = "Hello"
        val actual = w.English()
        assertEquals(expected,actual)
    }

    @Test
    fun TestAfrikaans(){
        val w = Words()
        val expected = "Hello daar"
        val actual = w.Afrikaans()
        assertEquals(expected,actual)
    }
    @Test
    fun TestZulu(){
        val w = Words()
        val expected = "Sawubona"
        val actual = w.Zulu()
        assertEquals(expected,actual)
    }
    @Test
    fun TestFrench(){
        val w = Words()
        val expected = "Salut"
        val actual = w.French()
        assertEquals(expected,actual)
    }

}