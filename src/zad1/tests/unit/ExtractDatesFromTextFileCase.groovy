package zad1.tests.unit

import groovy.test.GroovyTestCase
import zad1.Main

class ExtractDatesFromTextFileCase extends GroovyTestCase {
    void testAssertion() {
        assertEquals(Main.extractDatesFromTextFile(
                "/home/pawel/Documents/INSYNC_backup/BACKUP_LUBUNTU/Backup/Studia_MGR/III_semestr/PJP/PD/PD3c/PJP3_LP_S23452/src/zad1/files",
                "input_text.txt"),
                ["2021-01-01", "2023-02-28", "2020-02-29", "2024-02-29", "1999-01-23", "2005-10-01", "1600-02-29", "0971-01-31", "0001-06-30", "0000-05-31",
                 "2021-02-29", "2021-13-01", "2021-08-32", "2021-04-31", "2021-00-00", "2021-00-01"])
    }
}