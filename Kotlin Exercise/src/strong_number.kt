fun main() {
   var num: Int
   var saveNum: Int
   var sum= 0
   var temp: Int
   var r: Int
   var fact: Int
   var i: Int

   println("Enter Any Number: ")
   num = readLine()!!.toInt()
   saveNum = num
   temp = num

   // while loop for strong number
   while (temp > 0) {
      r = temp % 10
      fact = 1
      i = 1
      while (i <= r) {
         fact *= i
         i++
      }
      sum += fact
      temp /= 10
   }

   if (sum == saveNum) {
      println("$saveNum is Strong Number")
   } else {
      println("$saveNum is Not a Strong Number")
   }
}
