fun main() {
    var num:Int
    var org:Int
    var reversed:Int
    var digit:Int

    println("Enter Any Number: ")
    num= readLine()!!.toInt()

    org=num
    reversed=0

    while (org>0){
        digit=org%10
        reversed=reversed*10+digit
        org/=10


    }
    // checking a palindrom number
    if (num==reversed){
        println("$num is Palindrom Number")
    }
    else{
        println("$num is Not a Palindrom Number")
    }

}