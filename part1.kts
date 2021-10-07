
open class Shape(_shapeName: String,_shapeColor:String) {

    lateinit var shapeName: String
    lateinit var shapeColor: String


    init { shapeColor = "black" ;shapeName = "Shape" }

    open fun info():String {
        println("$shapeName info ")
        println("shep name : $shapeName   shepe color $shapeColor")

        return "shep name : $shapeName   shepe color $shapeColor"

    }

    open fun computeArea(): Double { println("computeAre");return 0.0 }

}

//-----------------------Class 1----------------------------------
class Rectangle(var _shapeName:String,var _shapeColor: String,var width:Double ,var height: Double) : Shape(_shapeName,_shapeColor) {

    override fun info():String {return "shep name : $_shapeName ,  shepe color $_shapeColor"}

    override fun computeArea(): Double {
        //`Rectangle area = height times width  (A = h * w)`

        var rectangle = width * height
        println("rectangle = $width * $height")
        return rectangle
    }
}


//-----------------------Class 2----------------------------------

class Triangle(var _shapeName:String,var _shapeColor: String,var height:Double, var base:Double) : Shape(_shapeName,_shapeColor) {

    override fun info():String {return "shep name : $_shapeName ,  shepe color $_shapeColor"}


    override fun computeArea(): Double {

        //`Triangle area = half of height times base (A = (h * b)/2 )`

        var triangle = ((height * base) / 2)
        println("Triangle area =($height * $base )/2)")
        return triangle
    }
}


//-----------------------Class 3----------------------------------

class Circle(var _shapeName:String,var _shapeColor: String,var radius:Double) : Shape(_shapeName,_shapeColor) {

    override fun info():String {return "shep name : $_shapeName ,  shepe color $_shapeColor"}

    //`Circle area = pi times the radius squared (A = π*r²)`
    override fun computeArea(): Double {

        var circle = (3.14 * (radius * radius))
        println("Circle area=( 3.14 *($radius * $radius))")
        return circle
    }
}


fun main() {


    var rectangle = Rectangle("Rectangle","red",4.0,6.0)

    println(rectangle.info())
    println(rectangle.computeArea())

    println("-------------------------------------------\n")


    var triangle = Triangle("Triangle","orange",4.0,2.0)

    println(triangle.info())
    println(triangle.computeArea())


    println("-------------------------------------------\n")

    var circle = Circle("Circle","green",4.0)

    println(circle.info())
    println(circle.computeArea())
}