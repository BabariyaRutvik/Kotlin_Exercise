fun main() {
    var a:Int
    var b:Int

    println("Enter 1st Number: ")
    a= readLine()!!.toInt()

    println("Enter 2nd Number: ")
    b= readLine()!!.toInt()


    println("Befor Swap the Number: $a")
    println("Before Swap the Number: $b\n")

    a=a+b
    b=a-b
    a=a-b

    println("After Swipping: $a")
    println("After Swipping: $b")
}