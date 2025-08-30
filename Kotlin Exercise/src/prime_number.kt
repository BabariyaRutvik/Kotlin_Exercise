fun main() {
    var i: Int
    var n: Int
    var count = 0

    println("Enter a Number: ")
    n = readLine()!!.toInt()

    for (i in 1..n) {
        if (n % i == 0) {
            count++
        }
    }
    if (count == 2) {
        println("$n is a Prime Number: ")
    } else {
        println("$n is Not Prime Number: ")

    }
}

