fun main() {
//    var i:Int
//    var n:Int
//    var fact=1
//
//    println("Enter Any Number: ")
//    n= readLine()!!.toInt()
//
//    for (i in 1..n){
//        fact=fact*i
//
//    }
//    println("Factorial of $n is $fact")

    /*
    ==============================================
        Using Function
    ===============================================
     */
    var n:Int

    println("Enter Any Number: ")
    n= readLine()!!.toInt()

    val fact=factorial(n)

    println("Factorial of $n is $fact")



}
fun factorial(n:Int):Int{
    return if (n<=1){
        1
    }
    else{
        n*factorial(n-1)
    }
}