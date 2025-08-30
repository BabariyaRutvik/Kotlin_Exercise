fun main() {
    var radius:Int
    var area:Float

    println("Enter the Radius of the Circle: ")
    radius= readLine()!!.toInt()

    area= (3.14*radius*radius).toFloat()

    println("Area of Circle is: $area")

}