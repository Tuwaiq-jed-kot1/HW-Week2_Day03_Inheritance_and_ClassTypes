//## Part I - Practice with Inheritance.
open class Shape(private val shapeName: String, private val shapeColor: String) {
    fun info(): String {
        return "shape name: $shapeName, and color: $shapeColor"
    }

    open fun computeArea(): Double {
        return 0.0
    }
}

class Triangle(shapeName: String, shapeColor: String) : Shape(shapeName, shapeColor) {
    private var base: Double = 0.0
    private var height: Double = 0.0

    constructor(shapeName: String, shapeColor: String, _base: Double, _height: Double) : this(shapeName, shapeColor) {
        base = _base
        height = _height
    }

    override fun computeArea(): Double {
        return (height * base) / 2
    }
}

class Rectangle(shapeName: String, shapeColor: String) : Shape(shapeName, shapeColor) {
    private var width: Double = 0.0
    private var height: Double = 0.0

    constructor(shapeName: String, shapeColor: String, _width: Double, _height: Double) : this(shapeName, shapeColor) {
        width = _width
        height = _height
    }

    override fun computeArea(): Double {
        return height * width
    }
}

class Circle(shapeName: String, shapeColor: String) : Shape(shapeName, shapeColor) {
    private var pi: Double = 0.0
    private var radius: Double = 0.0

    constructor(shapeName: String, shapeColor: String, _pi: Double, _radius: Double) : this(shapeName, shapeColor) {
        pi = _pi
        radius = _radius
    }

    override fun computeArea(): Double {
        return pi * (radius * radius)
    }
}

fun main() {
    val triangle = Triangle("Triangle", "green", 4.3, 8.6)
    println(triangle.info())
    println("The Area: ${triangle.computeArea()}")
}