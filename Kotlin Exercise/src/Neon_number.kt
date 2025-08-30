fun main() {
    var n:Int
    var sq:Int
    var sum=0

    println("Enter Any Number: ")
    n= readLine()!!.toInt()

    sq=n*n// finding the square number

    /*
    calculating the sum of square
     */
    while (sq>0){
        sum=sum+sq%10
        sq=sq/10

    }
    if (sum==n){
        println("$n is a Neon Number")
    }
    else
    {
        println("$n is Not a Neon Number")
    }
}