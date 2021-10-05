# Kotlin Essentials (Inheritance and Class types)
---
The Kotlin assignment has two components:
- Part I: Practice with Inheritance.
- Part II: Practice with Class types. 

## Part I - Practice with Inheritance.

open class Shape(var shapeName: String, var shapColor: String) {

    open var shapArea = 0.0
    open fun info() {

        println("the shape is $shapeName and the color is $shapColor ")
    }//height:Double,width :Double

    open fun computeArea(): Double {

        return shapArea
    }

}

class Triangle(shapeNameT: String, shapColor: String, baseT: Double, heightT: Double) : Shape(shapeNameT, shapColor) {
var base: Double = baseT
var height: Double = heightT
override var shapArea: Double = (base * height) / 2


    override fun computeArea(): Double {

        println("the area of tringle is : ${"%.2f".format(shapArea)}")
        return shapArea
    }
}

class Rectangle(shapeNameR: String, shapColor: String, widthR: Double, heightR: Double) : Shape(shapeNameR, shapColor) {
var width = widthR
var height = heightR
override var shapArea: Double = width * height / 2
override fun computeArea(): Double {
println("the area of rectangle is : ${"%.2f".format(shapArea)}")
return shapArea
}
}

class Circle(shapeNameC: String, shapColor: String, radius: Double) : Shape(shapeNameC, shapColor) {
var pi = 3.14
override var shapArea: Double = radius * radius * pi
override fun computeArea(): Double {
println("the area of circle is : ${"%.2f".format(shapArea)}")
return shapArea
}

}

fun main() {
val T = Triangle("Triangle", "black", 2.4, 5.6)
T.computeArea()
T.info()
val R = Rectangle("Rectangle", "Red", 3.5, 3.7)
R.computeArea()
R.info()
val C = Circle("Circle", "bink", 3.5)
C.computeArea()
C.info()


}
## Part II - Practice with Class types.
---
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
-Enum classes represent a concrete set of values,Enums have ordinal and we can hold constant data by each item.
- They are perfect to represent a constant set of possible values.

- A data class is a class that only contains state and does not perform any operation. 
- The advantage of using data classes instead of regular classes is 
- that Kotlin gives us an immense amount of self-generated code.
- 
- Which one of the `object` keyword ways can be used for the inheritance concept?
  Companion Object
- object ClassName :Single Inheritance..[]
- 

