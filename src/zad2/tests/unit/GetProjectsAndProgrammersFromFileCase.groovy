package zad2.tests.unit

import groovy.test.GroovyTestCase

import zad2.Main

class GetProjectsAndProgrammersFromFileCase extends GroovyTestCase {
    void testAssertion() {
        assertEquals(Main.getProjectsAndProgrammersFromFileCase("src/zad2/tests/unit/files", "projects.txt"),
                "abc")

    }
}
