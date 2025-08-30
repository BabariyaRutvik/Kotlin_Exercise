fun main() {
    var n:Int
    var num:Int
    var r:Int
    var t:Int
    val sq:Int
    var equal=1

    println("Enter Any Number: ")
    n= readLine()!!.toInt()

    num=n
    sq=n*n
    t=10

    println("Square of $n is $sq")

    while (n>0){
        r=sq%t
        if (num==r){
            equal=1
            break


        }
        n=n/10
        t=t*10

    }
    if (equal==1){
          println("$num is Automorphoic Number")
    }
    else{
        println("$num is Not a Automorphic Number")
    }
}