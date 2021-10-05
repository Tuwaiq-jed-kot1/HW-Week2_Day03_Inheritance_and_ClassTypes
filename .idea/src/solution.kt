open class Shape(val shapeName: String, val shapeColor: String) {
    fun info () {
        println(" Shape : $shapeName \n Color : $shapeColor")
    }
   open fun computeArea(): Double {
       return 0.0
    }
}
class Triangle (var shapeName1: String, var shapeColor1: String, var base: Double, var height: Double) :
    Shape(shapeName1,shapeColor1){
    override fun computeArea() : Double {
        return (base * height) / 2

    }
}
class Rectangle (var shapeName1: String, var shapeColor1: String,var width: Double, var height: Double):
    Shape(shapeName1,shapeColor1) {
    override fun computeArea() : Double {
        return height * width

    }
}
class Circle (var shapeName1: String, var shapeColor1: String, var pi: Double, var redius: Double ) :
    Shape(shapeName1,shapeColor1) {
    override fun computeArea() : Double {
        return pi * ( redius * 2 )

    }
}

fun main (){
    val firstTriangle = Triangle("Triangle", "Purple", 7.0, 5.0)
    firstTriangle.info()
    println(" Area : ${firstTriangle.computeArea()} m\u00B2")
    println("_________")
    val firstRectangle = Rectangle("Rectangle", "Blue", 3.6, 5.0)
    firstRectangle.info()
    println(" Area : ${firstRectangle.computeArea()} m²")
    println("_________")
    val firstCircle = Circle("Circle", "Pink", 2.4, 4.1)
    firstCircle.info()
    println(" Area : ${"%.2f".format(firstCircle.computeArea())} m²")


}

/* Q1 : we use Data Class to store parameters and give it a val that can't be change by other classes.
while enum class is to store parameter and give it a var that can be change by other classes.
Q2 : we use " open " before " class "
 */