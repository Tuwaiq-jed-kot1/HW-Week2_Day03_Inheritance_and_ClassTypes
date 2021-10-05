//Part|
import kotlin.math.pow

open class Shape(var shapeName:String, var shapeColor:String){
    fun info(){
        println("The shap is $shapeColor $shapeName and Its area is ${"%.2f".format(computeArea())}")
    }

    open fun computeArea(): Double {
        return 0.0
    }
}

class Triangle(shapeName: String,shapeColor: String,var base:Double,var height:Double) : Shape(shapeName,shapeColor){
    override fun computeArea(): Double {
        return (base * height) / 2
    }
}

class Rectangle(shapeName: String,shapeColor: String,var width:Double,var height:Double) : Shape(shapeName,shapeColor){
    override fun computeArea(): Double {
        return width * height
    }
}

class Circle (shapeName: String,shapeColor: String,var radius:Double) : Shape(shapeName,shapeColor){
    override fun computeArea(): Double {
        val pi = 3.14
        return pi * (radius.pow(2))
    }
}

fun main(){
    //part| calling
    val triangle=Triangle("Triangle","Orange",3.0,4.0)
    val rectangle=Rectangle("Rectangle","Blue",3.6,5.2)
    val circle=Circle("Circle","Green",4.6)

    triangle.info()
    rectangle.info()
    circle.info()

    //Part||
    //Q1- What is the difference between enum classes and data classes?
    // Solution:
    // enum class limits the possible values of a specific variable its useful for defining a collection of constants.
    // data class is a class that only contains data or state and does not perform any operation its like data type.

    //Q2- Which one of the object keyword ways can be used for the inheritance concept?
    // Solution:
    // Companion object, to be able to declare static methods.


}
