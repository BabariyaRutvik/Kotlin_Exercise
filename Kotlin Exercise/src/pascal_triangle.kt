fun main() {
    var line: Int
    var i: Int
    var j: Int

    println("Enter the Number of Lines: ")
    line = readLine()!!.toInt()

    for (i in 0 until line) {
        // print spaces
        for (s in 0 until (line - i - 1)) {
            print(" ")
        }

        // print Pascal triangle numbers
        for (j in 0..i) {
            print("${fact(i) / (fact(j) * fact(i - j))} ")
        }

        println() // move to next line
    }
}

fun fact(num: Int): Int {
    var f = 1
    var i = 1
    while (i <= num) {
        f *= i
        i++
    }
    return f
}
