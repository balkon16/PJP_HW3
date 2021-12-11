/**
 *
 *  @author Lonca Paweł S23452
 *
 */

package zad2;

static getProjectsAndProgrammersFromFileCase(path, file="Projekty.txt") {
//    def scriptDir = getClass().protectionDomain.codeSource.location.path
//    print(scriptDir)

    def f = new File(path, file)
    f.splitEachLine("\t") {
        print it
    }
}

getProjectsAndProgrammersFromFileCase("./files")
//print(getProjectsAndProgrammersFromFileCase("./files"))
