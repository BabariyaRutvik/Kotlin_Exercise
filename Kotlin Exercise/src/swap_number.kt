fun main() {
    var a:Int
    var b:Int
    var c:Int

    println("Enter 1st Number: ")
    a= readLine()!!.toInt()

    println("Enter 2nd Number: ")
    b= readLine()!!.toInt()

    println("Befor Swap the Number: $a")
    println("Before Swap the Number: $b\n")

    c=a
    a=b
    b=c

    println("After Swipping $a")
    println("After Swipping $b")


}