import kotlin.math.pow
/*
Name : Husam Talal Metro
Homework : Week 2 Day 3
 */
// Part 1
open class Shape(private val shapeName: String, private val shapeColor: String) {

    fun info() {
        println("\n${javaClass.name} Name = $shapeName , Color = $shapeColor")
    }

    open fun computeArea(): Double {
        println("Shape is the Parent it has no height or width , Please choose one of his children...")
        return 0.0
    }

    fun printComputeArea() {
        print("$shapeName Compute Area = ${this.computeArea()} \n")
    }

}

class Rectangle(shapeName: String, shapeColor: String, private val width: Double, private val height: Double) :
    Shape(shapeName, shapeColor) {
    override fun computeArea(): Double = height * width

}

class Triangle(shapeName: String, shapeColor: String, private val base: Double, private val height: Double) :
    Shape(shapeName, shapeColor) {
    override fun computeArea(): Double = ((height * base) / 2)

}

class Circle(shapeName: String, shapeColor: String, private val radius: Double) :
    Shape(shapeName, shapeColor) {
    private val pi: Double = Math.PI
    override fun computeArea(): Double = pi * radius.pow(2.0)
}

fun main() {
    val shape = Shape("S1", "White")
    shape.info()
    shape.printComputeArea()
    val rectangle = Rectangle("R1", "Blue", 10.0, 5.0)
    rectangle.info()
    rectangle.printComputeArea()
    val triangle = Triangle("T1", "Orange", 10.0, 15.0)
    triangle.info()
    triangle.printComputeArea()
    val circle = Circle("C1", "Green", 6.0)
    circle.info()
    circle.printComputeArea()
}
// Part 2
/*
- What is the difference between `enum classes` and `data classes`?
                              ---- Enumerations ----
  1- Enums in Kotlin are data types that hold a set of constants (Finals).
  2- Enums are defined by adding the modifier enum in front of a class
  3- Enums are useful in enhancing the readability of your code since it assigns pre-defined names to constants.
  4- Unlike classes, an instance of enum classes cannot be created using constructors.
                              ---- Data Classes ----
  1- Data classes are classes that serve only as data models focus on properties.
  In such classes, the compiler can derive some functionality from its member properties.
  2- The Kotlin compiler automatically generates the following functionality for them:
  toString() , equals() , hashCode() , copy() and componentN() methods

- Which one of the `object` keyword ways can be used for the inheritance concept?
  The Keyword (object name) you can inherit from existing class or implement interfaces for example :
  object Pentagon : Shape("P1","Yellow"){ }
*/