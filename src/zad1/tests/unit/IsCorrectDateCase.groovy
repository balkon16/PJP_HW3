package zad1.tests.unit

import groovy.test.GroovyTestCase
import zad1.Main

class IsCorrectDateCase extends GroovyTestCase {
    void testAssertion() {
        assertTrue(Main.isCorrectDate("2021-01-01"))
        assertTrue(Main.isCorrectDate("2023-02-28"))
        assertTrue(Main.isCorrectDate("2024-02-29"))
        assertTrue(Main.isCorrectDate("2020-02-29"))
        assertTrue(Main.isCorrectDate("1999-01-23"))
        assertTrue(Main.isCorrectDate("2005-10-01"))
        assertTrue(Main.isCorrectDate("1600-02-29"))
        assertTrue(Main.isCorrectDate("0971-01-31"))
        assertTrue(Main.isCorrectDate("0001-06-30"))
        assertTrue(Main.isCorrectDate("0000-05-31"))

        assertFalse(Main.isCorrectDate("2021-02-29"))
        assertFalse(Main.isCorrectDate("2021-13-01"))
        assertFalse(Main.isCorrectDate("2021-08-32"))
        assertFalse(Main.isCorrectDate("2021-04-31"))
        assertFalse(Main.isCorrectDate("2021-00-00"))
        assertFalse(Main.isCorrectDate("2021-00-01"))
        assertFalse(Main.isCorrectDate("2021-02-00"))
        assertFalse(Main.isCorrectDate("1700-02-29"))
        assertFalse(Main.isCorrectDate("0971-01-32"))
        assertFalse(Main.isCorrectDate("0001-06-31"))
        assertFalse(Main.isCorrectDate("0000-05-00"))
        assertFalse(Main.isCorrectDate("0000-00-00"))
        assertFalse(Main.isCorrectDate("0000-15-00"))
    }
}
