fun main() {
    var i:Int
    var reverse=0

    println("Enter Any Number: ")
    i= readLine()!!.toInt()

    while (i!=0){
        reverse=reverse*10
        reverse=reverse+i%10
        i=i/10
    }
    println("Reverse Number is: $reverse")
}