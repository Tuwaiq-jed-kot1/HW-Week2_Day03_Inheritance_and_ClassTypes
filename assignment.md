# Kotlin Essentials (Inheritance and Class types)
---
The Kotlin assignment has two components:
- Part I: Practice with Inheritance.
- Part II: Practice with Class types. 

## Part I - Practice with Inheritance.
---
![alt text](example.png)

To apply the Inheritance concept, create one superclass called `Shape` that has two properties called `shapeName` and `shapeColor`, and also has two functions one called `info()` that return name and color of shape and the other one called `computeArea()` that has no parameter, and return Double data type.

On the other hand, there are three subclasses that inherit from the superclass called `Triangle`, `Rectangle`, and `Circle`. Each subclass has different properties according to it. For example, Rectangle has `width` and `height` properties, Triangle has `base` and `height` properties, and Circle has `pi` and `radius` properties.

You need to change the body of `computeArea()` in each subclass to make sure this function will compute the area according to the subclass' name. For example, `computeArea()` in the `Triangle` subclass will calculate the triangle area, and so on.

```sh
Formulas to compute area:
`Circle area = pi times the radius squared (A = π*r²)`
`Rectangle area = height times width  (A = h * w)`
`Triangle area = half of height times base (A = (h * b)/2 )`
```
open class Shape(var shapeName :String, var shapeColor: String) {

    fun info() {
        println("the shape is: $shapeName... and the color is: $shapeColor")
    }
    open fun computeArea():Double{
        return 1.0
    }

        //      --->>>calculate the area of the Triangle<<<---
    class Triangle(tName: String, tColor: String, val base:Double,
                   val tHeight:Double) : Shape(tName, tColor) {
            override fun computeArea(): Double = base * tHeight
    }
    
        //      --->>>calculate the area of the Rectangle<<<---
    class Rectangle(rName: String, rColor: String,val width: Double,
                    val rHeight: Double) : Shape(rName, rColor) {
            override fun computeArea(): Double = width * rHeight 
    }

        //      --->>>calculate the area of the Rectangle<<<---
        // there is another way to solve it put the value out the parameter
    class Circle(cName: String, cColor: String) : Shape(cName, cColor) {
                val pi = 3.14
                val radius = 2.0
            override fun computeArea(): Double = pi * radius * radius
    }
    fun calculate(){
        println("and the area is ${computeArea()}")
    }
}

fun main() {
val triangle = Shape.Triangle("Triangle", "orange", 4.0,2.0)
triangle.info()
triangle.calculate()
println("---->>>><<<<----")
val rectangle = Shape.Rectangle("Rectangle","blue",6.0,2.0)
rectangle.info()
rectangle.calculate()
println("---->>>><<<<----")
val circle = Shape.Circle("Circle", "green")
circle.info()
circle.calculate()
}

## Part II - Practice with Class types.
---
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
  - ------------->>>enum<<<---------------
  - how to write it:-
  - enum class Langueg{ English, Spain, Arabic;}
  - we can use enum for constant value like(day and months)
  - ------------->>>data<<<---------------
  - how to write it:-
  - data class stuInfo(var name: String, var id: Int, var GPA: Double){}
  - 
- Which one of the `object` keyword ways can be used for the inheritance concept? 
- Object Keyword (not companion object)


