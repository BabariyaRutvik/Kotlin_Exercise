fun main() {
    var i:Int
    var j:Int
    var n=6

    for (i in 0 until n){
        for ( j in 0 until n){
            /* star will print only when  it is in first
             row or last row or first column or last
             column */

            if(i==0||j==0||i==n-1||j==n-1){
                print("*")
            }
            else{
                print(" ")
            }

        }
        println()
    }
}
/*
==================================================
******
*    *
*    *
*    *
*    *
******
===================================================
 */