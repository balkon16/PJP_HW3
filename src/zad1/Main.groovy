/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad1

static extractDatesFromTextFile(path, file) {
    def f = new File(path, file)
    def allMatches = []
    f.eachLine {
        def matcher = it =~ /\d{4}-\d{2}-\d{2}/
        allMatches.addAll(matcher.findAll())
    }
    return allMatches
}

static isCorrectDate(dateStr) {
    def daysInMonth = [
            "01": [31, 31],
            "02": [28, 29],
            "03": [31, 31],
            "04": [30, 30],
            "05": [31, 31],
            "06": [30, 30],
            "07": [31, 31],
            "08": [31, 31],
            "09": [30, 30],
            "10": [31, 31],
            "11": [30, 30],
            "12": [31, 31]
    ]

    def (yearStr, monthStr, dayStr) = dateStr.split("-")
    def yearInt = yearStr.toInteger()
    def isLeapInt = ((yearInt % 4 == 0 & yearInt % 100 != 0) | (yearInt % 400 == 0)) ? 1 : 0
    def maxDays = daysInMonth.getOrDefault(monthStr, null)
    if (maxDays.is(null)) return false
    if (dayStr.toInteger() > maxDays[isLeapInt] | dayStr.toInteger() == 0) return false
    return true
}


extractDatesFromTextFile("./files", "input_text.txt").each {
    def ans = (isCorrectDate(it)) ? "$it is a correct data." : "$it is an incorrect date."
    println(ans)
}