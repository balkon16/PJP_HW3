package zad2.tests.unit

import groovy.test.GroovyTestCase

import zad2.Main

class GetProjectsAndProgrammersFromFileCase extends GroovyTestCase {
    void testAssertion() {
        assertEquals(Main.getProjectsAndProgrammersFromFileCase("src/zad2/tests/unit/files", "projects.txt"),
                new Tuple2([
                        "Data warehouse initiative" : ["Kowalski Bartosz", "Brzęczyszczykiewicz Grzegorz"],
                        "Frontend maintenance"      : ["Kowalski Bartosz", "Kowalska Anna", "Nowak Adam", "Laptop Katarzyna"],
                        "Obsługa klienta"           : ["Komputer Andrzej", "Laptop Katarzyna", "Listwa Grzegorz"],
                        "Accounting"                : ["Lonca Paweł"],
                        "Business solutions for CEE": ["Kowalska Anna", "Listwa Grzegorz"],
                        "Divested project"          : []
                ], [
                        "Kowalski Bartosz"            : ["Data warehouse initiative", "Frontend maintenance"].toSet(),
                        "Brzęczyszczykiewicz Grzegorz": ["Data warehouse initiative"].toSet(),
                        "Kowalska Anna"               : ["Frontend maintenance", "Business solutions for CEE"].toSet(),
                        "Nowak Adam"                  : ["Frontend maintenance"].toSet(),
                        "Laptop Katarzyna"            : ["Frontend maintenance", "Obsługa klienta"].toSet(),
                        "Komputer Andrzej"            : ["Obsługa klienta"].toSet(),
                        "Listwa Grzegorz"             : ["Obsługa klienta", "Business solutions for CEE"].toSet(),
                        "Lonca Paweł"                 : ["Accounting"].toSet()
                ]))

    }
}
