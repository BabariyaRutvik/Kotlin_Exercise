fun main() {
    var i:Int
    var j:Int
    var k:Int
    var n=5

    for (i in n downTo 1){
        for (j in (n-1) downTo i){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
    }
}
/*
==================================================
*****
 ****
  ***
   **
    *
=================================================
 */