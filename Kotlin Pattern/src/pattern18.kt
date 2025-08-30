fun main() {
    val n = 6

    for (i in 1..n) {
        // print spaces (decreasing each row)
        for (j in 1..(n - i)) {
            print(" ")
        }

        // print numbers with space
        for (j in 1..i) {
            print("$i ")
        }

        println()
    }
}
/*
==================================================
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
==================================================
 */
