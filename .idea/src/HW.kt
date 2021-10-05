
open class Shape (val shapeName:String,val shapeColor:String) {

    fun info() {
        println("information of the shape the name is $shapeName and the color is $shapeColor")

    }

    open fun computeArea(): Double {
        return 0.0
    }

    class Triangle(_name: String, _color: String, val base: Double, val height: Double) : Shape(_name, _color) {
        override fun computeArea(): Double {
            return ((height * base) / 2)
        }


    }

    class Rectangle(_name: String, _color: String, val width: Double, val height: Double) : Shape(_name, _color) {
        override fun computeArea(): Double {
            return (height * width)
        }
    }

    class Circle(_name: String, _color: String, val radius: Double) : Shape(_name, _color) {
        override fun computeArea(): Double {
            val pi: Double = 3.1
            return (pi * radius)
        }
    }




fun main() {
val shape = Shape ("shape1", "Black")
    shape.info()
    shape.computeArea()
    val triangle = Triangle("triangle", "Blue", 9.0 , 3.0)
    triangle.info()
    triangle.computeArea()
    val rectangle = Rectangle("rectangle", "red", 10.0 , 8.0)
    rectangle.info()
    rectangle.computeArea()
    val circle = Circle("triangle", "Blue", 9.0 )
    circle.info()
    circle.computeArea()
}}