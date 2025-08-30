fun main() {
    var n:Int;

    println("Enter Any Number: ")
    n= readLine()!!.toInt()

    if(n%2==0){
        println("$n Even: ")
    }
    else{
        println("$n is Odd")
    }
}