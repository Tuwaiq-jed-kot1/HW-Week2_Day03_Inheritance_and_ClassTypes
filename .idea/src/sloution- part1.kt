
open class Shape(var shapeName: String, var shapeColor : String){

     fun info() : String{
         return "$shapeName, $shapeColor"
    }

    open fun computeArea() : Double {
         return 0.0
    }

}
class Triangle(var base:Double,var height:Double): Shape(shapeName = "Triangle", shapeColor = "Blue" ) {


    override fun computeArea() :Double  {
    /*    var base = 20.0
        var height = 30.6
        val a = 1.0 / 2.0 * base * height
        println(a) */
       return base*height /2



    }


}

class Circle(var radius : Double , var pi :Double): Shape (shapeColor = "red", shapeName = "Circle") {

    override fun computeArea() :Double {
        return pi* radius *radius
    }
}
class Rectangle(var width :Double, var height :Double): Shape (shapeName = "Rectangle", shapeColor = "yellow") {

    override fun computeArea() :Double {
        return width * height
    }
}

fun main (){
    val ti = Triangle()
    ti.computeArea()
    val ci = Circle()
    ci.computeArea()
    val  re = Rectangle()
    re.computeArea()


}
