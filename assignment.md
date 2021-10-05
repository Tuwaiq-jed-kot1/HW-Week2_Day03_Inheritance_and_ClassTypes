# Kotlin Essentials (Inheritance and Class types)
---
The Kotlin assignment has two components:
- Part I: Practice with Inheritance.
- Part II: Practice with Class types. 

## Part I - Practice with Inheritance.

To apply the Inheritance concept, create one superclass called `Shape` that has two properties called `shapeName` and `shapeColor`, and also has two functions one called `info()` that return name and color of shape and the other one called `computeArea()` that has no parameter, and return Double data type.

On the other hand, there are three subclasses that inherit from the superclass called `Triangle`, `Rectangle`, and `Circle`. Each subclass has different properties according to it. For example, Rectangle has `width` and `height` properties, Triangle has `base` and `height` properties, and Circle has `pi` and `radius` properties.

You need to change the body of `computeArea()` in each subclass to make sure this function will compute the area according to the subclass' name. For example, `computeArea()` in the `Triangle` subclass will calculate the triangle area, and so on.

```sh
Formulas to compute area:
`Circle area = pi times the radius squared (A = π*r²)`
`Rectangle area = height times width  (A = h * w)`
`Triangle area = half of height times base (A = (h * b)/2 )`
```

open class Shape (){

    lateinit  var shapeName : String
    lateinit  var shapeColor : String

open fun info(){
println("shapeInfo")
println(" $shapeName $shapeColor") }

open fun computerArea():Double
{
println("computerAreaS")

        var height : Double = 12.00
        var base : Double =11.00
        var radius: Double = 2.0
        var width: Double = 5.00
        var pi: Double = 6.00

return 0.0

}}

class Triangle(shapeName:String, shapeColor:String ):Shape(){
override fun info(){
println("shapeInfo")
println("shapeType: $shapeName $shapeColor") }

    override fun computerArea():Double{
        println("computerAreaS")
        var height:Double=12.00
        var base :Double=11.00

        var triangle =((height * base)/2)

        println("Triangle area $triangle")
        return triangle
    }
}

class Rectangle(shapeName:String, shapeColor:String):Shape(){
override fun info(){
println("shapeInfo")
println("shapeType : $shapeName $shapeColor")}


    override fun computerArea():Double{
        println("computerAreaS")
        var height :Double=12.00
        var width  :Double=5.00

        var rectangle = (width*height)

        println("Rectangle area $rectangle")
        return rectangle
    }}

class Circle(shapeName:String, shapeColor:String):Shape() {
override fun info() {
println("shapeInfo")
println("shapeType : $shapeName $shapeColor")
}


    override fun computerArea(): Double {
        println("computerAreaS")
        var radius: Double = 2.0
        val pi = 6.00

        var circle = (pi * (radius * radius))

       println("Circle area $circle ")
       return circle
    }
}


fun main() {
val r = Shape()

    r.shapeName= "SNr"
    r.shapeColor= "blue"

    println(r.shapeName)
    println(r.shapeColor)

val triangle =Triangle("t1", "yellow")
triangle.computerArea()
println()

val rectangle =Rectangle("r1", "black")
rectangle.computerArea()
println()

val circle= Circle("c1", "brown")
circle.computerArea()
println()
}

## Part II - Practice with Class types.
---
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
- ex:
  enum class Day{ Sunday,Monday;}
  we  use enum for constant value
  ex:
  data class birthinfo(var name: String, var year: Int){}

- Which one of the `object` keyword ways can be used for the inheritance concept?
  The Keyword:compaion object


