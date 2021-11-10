open class Shape{
    val shapeName: String
    val shapeColor: String

    fun info(): String{
        return "Shape's info"
    }

    fun computeArea(): Double{
        return 0.0
    }
}

class Triangle : Shape{
    val base: Double
    val height: Double
    fun info (): String{ return "This is a triangle"}
    fun computeArea(): Double{ return (height * base) / 2}
}

class Rectangle : Shape{
    val height: Double
    val width: Double
    fun info(): String{return "This is a rectangle"}
    fun computeArea(): Double{return height * width}
}
class Circle : Shape{
    val pi = 3.14
    val radius: Double
    fun info(): String{return "This is a circle"}
    fun compputeArea(): Double{return pi * radius * radius}
}

//What is the difference between enum classes and data classes?
//  Enumeration is a named list of constants while data classes are simple classes that are used to contain data
//Which one of the object keyword ways can be used for the inheritance concept?