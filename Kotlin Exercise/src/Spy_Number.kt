fun main() {
    var n:Int
    var sum=0
    var pro=1
    var d:Int
     var saveNum:Int

    println("Enter Any Number: ")
    n= readLine()!!.toInt()
    saveNum=n
    /*
     Calculating the sum of square
     */
    while (n>0){
        d=n%10
        sum=sum+d
        pro=pro*d
        n=n/10


    }
    /*
    Chacking the Sum and Product of the Number
     */
    if (sum==pro){
        println("$saveNum is a Spy Number")
    }
    else{
        println("$saveNum is Not a Spy Number")
    }


}