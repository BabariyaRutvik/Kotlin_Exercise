fun main() {
    var num:Int

    println("Enter Any Number: ")
    num= readLine()!!.toInt()

    if (num>0){
        println("$num is Positive Number")
    }
    else if (num<0){
        println("$num is Nagative Number")
    }
    else{
        println("The Number is Zero")
    }
}