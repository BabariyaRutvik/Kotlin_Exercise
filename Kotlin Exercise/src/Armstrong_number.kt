fun main() {
    var a:Int
    var n:Int
    var b=0
    var t:Int


    println("Enter Any Number: ")
    n= readLine()!!.toInt()

    t=n

    while (n>0){
        a=n%10
        b=b+a*a*a
        n=n/10


    }
    if (b==t){
        println("Armstrong Number: ")

    }
    else
    {
        println("Not Armstrong Number:")

    }

}