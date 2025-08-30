fun main() {
    var i:Int
    var j:Int
    var k:Int

    var p_height=5

    for (i in 1..p_height){
        for (k in (p_height-1) downTo i){
            print(" ")
        }
        for (j in 1..i){
            print("* ")
        }
        println()
    }
}
/*
===============================================
    *
   * *
  * * *
 * * * *
* * * * *
===============================================
 */

