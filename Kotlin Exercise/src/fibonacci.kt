fun main() {
    var a = 0
    var b = 1
    var c: Int
    var n: Int

    println("Enter Number:")
    n = readLine()!!.toInt()

    println("\nFibonacci Series:")


    print("$a $b ")


    for (i in 1..n) {
        c = a + b
        print("$c ")
        a = b
        b = c
    }
}
