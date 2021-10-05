//---------------------------------------## Part I - Practice with Inheritance.-----------------------------------------
open class Shape(val shapeName: String, val shapeColor: String) {


    fun info() {
        println("shape name: $shapeName\nshape color: $shapeColor")
    }

    open fun computeArea(): Double {
        return 0.0
    }
}

class Rectangle(_shapeName: String, _shapeColor: String, val width: Double, val height: Double) :
    Shape(_shapeName, _shapeColor) {
    override fun computeArea(): Double {
        return height * width
    }
}

class Triangle(_shapeName: String, _shapeColor: String, val base: Double, val height: Double) :
    Shape(_shapeName, _shapeColor) {
    override fun computeArea(): Double {
        return 0.5 * base * height  //(h * b)/2
    }
}

class Circle(_shapeName: String, _shapeColor: String, val radius: Double) :
    Shape(_shapeName, _shapeColor) {
    val pi = 3.14
    override fun computeArea(): Double {
        return pi* (radius * radius) //(A = π*r²)`

    }
}

fun main() {
    val myCircle = Circle("Circle", "Green", 2.5)
    myCircle.info()
    println("The area of the shape :${"%.2f".format(myCircle.computeArea())}")

    val myRectangle = Rectangle("Rectangle", "Red", 10.0, 20.0)
    myRectangle.info()
    println("The area of the shape :${"%.2f".format(myRectangle.computeArea())}")

    val myTriangle = Triangle("Triangle", "Yellou", 11.44, 11.44)
    myTriangle.info()
    println("The area of the shape :${"%.2f".format(myTriangle.computeArea())}")

}

//---------------------------------------## Part II - Practice with Class types.----------------------------------------
/*
What is the difference between enum classes and data classes?

I think we can consider an enum class as a way to create a custom data type.
 For example, we can use it to represent a constant set of possible options
 ( e.g week Days), which will make the check process easier.
---------
Data classes are approximately like normal classes, but they support
additional functions like toString(),equals(), and..etc.
Also, there are some limitations on data classes(e.g cannot be abstract, open, sealed, or inner).


Which one of the object keyword ways can be used for the inheritance concept?
I think, it is the Companion object.
*/
