/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad2;

static getProjectsAndProgrammersFromFileCase(path, file = "Projekty.txt") {
//    def scriptDir = getClass().protectionDomain.codeSource.location.path
//    print(scriptDir)

    def programmersByProject = [:]
    def projectsByProgrammer = [:]
    def f = new File(path, file)
    f.eachLine {
        def values = it.split("\t")
        def list_size = values.size()
        def projectName = values[0]
        def programmers
        if (list_size > 1) programmers = values[1..values.size() - 1]
        else programmers = []
        programmersByProject[projectName] = programmers
        programmers.each {
            def incompleteProjectsList = projectsByProgrammer.getOrDefault(it, [])
            if (incompleteProjectsList.size() == 0) projectsByProgrammer[it] = [projectName].toSet()
            else projectsByProgrammer[it].add(projectName)
        }
    }
    return new Tuple2<>(programmersByProject, projectsByProgrammer)
}

static writeBigProjects(projectsMap, path, filename = "ProjektyDuze.txt") {
    def ln = System.getProperty('line.separator')
    new File(path).mkdirs()
    def targetFile = new File(path, filename)
    projectsMap.each {
        if (it.value.size() > 3) targetFile << it.key + ln
    }
}

static writeProgrammers(collection, path, filename = "Programisci.txt") {
    def ln = System.getProperty('line.separator')
    new File(path).mkdirs()
    def targetFile = new File(path, filename)
    collection.each {
        targetFile << it.key + "\t" + it.value.join("\t") + ln
    }
}


def result = getProjectsAndProgrammersFromFileCase("./files")
def programmersByProject = result[0]
def projectsByProgrammers = result[1]
writeBigProjects(programmersByProject, "output")
writeProgrammers(projectsByProgrammers, "output")
