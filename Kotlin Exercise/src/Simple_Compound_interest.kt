import kotlin.math.pow

fun main() {
    var p:Double   // Principal
    var r:Double // rate of interest
    var t:Double // Time (in years)
    var n:Int      // Number of times interest applied per year

    println("Enter the Principle Amount: ")
    p= readLine()!!.toDouble()

    println("Enter the Rate of interest (in %):")
    r= readLine()!!.toDouble()

    println("Enter time (in Years): ")
    t= readLine()!!.toDouble()

    println("Enter number of times interest is compounded per year (for CI):")
    n = readLine()!!.toInt()

    /*
     Calculating the Simple interest
     */
     var si=(p*r*t)/100

    /*
      Calculating the Compound interest
     */

    val amount=p*(1+(r/(100*n))).pow(n*t)
    val ci=amount-p

    println("Simple interest is: $si")
    println("Coumpound interest is: $ci")



}