/**
 *
 *  @author Lonca Paweł S23452
 *
 */

package zad3

import groovy.io.FileType;

static listFiles(path) {
    def idx = 0
    new File(path).traverse(type: FileType.FILES) {
        if (it.name.endsWith(".html")) println("${++idx} ${it.absolutePath}")
    }
}

listFiles("files")