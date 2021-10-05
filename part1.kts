package Day3.HW3


open class Shape() {

    lateinit var shapeName: String
    lateinit var shapeColor: String


    init {
        shapeColor = "black"
        shapeName = "Shape"
    }

    open fun info() {

        println("$shapeName info ")
        println("shep name : $shapeName   shepe color $shapeColor")

    }

    open fun computeArea(): Double {
        println("computeAre")


        return 0.0

    }

}

//-----------------------Class 1----------------------------------
class Rectangle() : Shape() {

    override fun info() {

        shapeName = "Rectangle"
        shapeColor = "blue"

        println("$shapeName info ")

        println("shep name : $shapeName   shepe color $shapeColor")


    }

    override fun computeArea(): Double {

        println("\nRectangle area")


        //`Rectangle area = height times width  (A = h * w)`

        var width = 5.0
        var height = 15.0
        var rectangle = width * height
        println("$width * $height")

        return rectangle

    }

}


//-----------------------Class 2----------------------------------

class Triangle() : Shape() {


    override fun info() {

        shapeName = "Triangle"
        shapeColor = "red"

        println("$shapeName info ")
        println("shep name : $shapeName   shepe color $shapeColor")


    }

    override fun computeArea(): Double {

        println("\nTriangle area ")

        var height: Double = 5.0
        var base: Double = 10.0
        //`Triangle area = half of height times base (A = (h * b)/2 )`

        var triangle = ((height * base) / 2)
        println("($height * $base )/2)")


        return triangle

    }

}


//-----------------------Class 3----------------------------------

class Circle() : Shape() {


    override fun info() {

        shapeName = "Circle"
        shapeColor = "green"

        println("$shapeName info ")

        println("shep name : $shapeName ,  shepe color $shapeColor")

    }


    override fun computeArea(): Double {
        println("\nCircle area ")

        //`Circle area = pi times the radius squared (A = π*r²)`

        var radius: Double = 3.0

        var circle = (3.14 * (radius * radius))
        println("( 3.14 *($radius * $radius))")
        return circle

    }

}


fun main() {

    println("-------------------------------------------\n")

    var rectangle = Rectangle()
    rectangle.info()

    println(rectangle.computeArea())


    println("-------------------------------------------\n")


    var triangle = Triangle()

    triangle.info()

    println(triangle.computeArea())

    println("-------------------------------------------")


    var circle = Circle()


    circle.info()

    println(circle.computeArea())
}