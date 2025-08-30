fun main() {
    var year:Int

    println("Enter a Year: ")
    year= readLine()!!.toInt()

    if (year%400==0){
        println("$year is Leap Year")
    }
    else if (year%100==0){
        println("$year is Not Leap Year")
    }
    else if (year%4==0){
        println("$year is Leap Year")

    }
    else
    {
        println("$year is Not Leap Year")
    }
}