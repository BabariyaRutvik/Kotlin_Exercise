fun main() {
    var i = 1
    var n: Int
    var sum = 0

    println("Enter Any Number: ")
    n = readLine()!!.toInt()

    while (i < n) {
        if (n % i == 0) {
            sum += i
        }
        i++
    }

    if (sum == n) {
        println("$n is a Perfect Number")
    } else {
        println("$n is Not a Perfect Number")
    }
}
