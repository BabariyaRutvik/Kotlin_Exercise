fun main() {
    var i:Int
    var j:Int
    var k:Int

    var p_height=5

    for (i in p_height downTo 1){
      for (k in (p_height-1) downTo i){
          print(" ")
      }
        for (j in i downTo 1){
            print("* ")
        }
        println()
    }

}
/*
=====================================================
* * * * *
 * * * *
  * * *
   * *
    *
=====================================================
 */