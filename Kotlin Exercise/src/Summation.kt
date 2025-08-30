fun main() {
    var n:Int
    var num:Int
    var x:Int
    var sum=0
    var t:Int
    var expression=""

    println("Enter Any Number:")
    n= readLine()!!.toInt()
     t=n


    while (t>0){
       x=t%10
       sum+=x
        expression=if (expression.isEmpty()){
            "$x"// first digits
        }
        else
        {
            "$x+$expression"
        }
        t/=10

    }
    println("Sum of Digits is: $expression = $sum")

}