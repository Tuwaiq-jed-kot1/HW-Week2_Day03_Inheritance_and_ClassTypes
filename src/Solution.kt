// Part I - Practice with Inheritance.
open class Shape(shapeName : String , shapeColor : String){
    val shapeName = shapeName
    val shapeColor = shapeColor
    fun info(){
        println("Your shape is $shapeName with the color of $shapeColor")
    }
    open fun comuteArea() : Double{
        return 0.0
    }
}

class Triangle(base : Double, height : Double) : Shape(shapeName = "Triangle" , shapeColor = "Orange" ){
    val tringleBase = base
    val tringleHight = height
    //`Triangle area = half of height times base (A = (h * b)/2 )`
    override fun comuteArea(): Double {
        return (tringleHight * tringleBase) / 2
    }

}

class Rectangle(width : Double, height : Double) : Shape(shapeName = "Rectangle" , shapeColor = "Blue" ){
    val rectangleWidth = width
    val rectangleHight = height
    // `Rectangle area = height times width  (A = h * w)`
    override fun comuteArea(): Double {
        return rectangleHight * rectangleWidth
    }
}

class Circle(val pi : Double = 3.14 , radius : Double) : Shape(shapeName = "Circle" , shapeColor = "Green" ){
    val circlePi = pi
    val circleRadius = radius

    // `Circle area = pi times the radius squared (A = π*r²)`
    override fun comuteArea(): Double {
        return circlePi * (circleRadius)
    }
}

fun main(){
    val tringle = Triangle(14.0,10.0)
    tringle.info()
    println(tringle.comuteArea())
}

/* Part II - Practice with Class types.
Q: What is the difference between enum classes and data classes?

A: Which one of the object keyword ways can be used for the inheritance concept?
Enum classes represent data as set of constant values , While data class takes the values as parameters
to store them and work with it as variables and gives you the ability to generate your code easily.

Q: Which one of the object keyword ways can be used for the inheritance concept?
A: Companion Object .


 */



