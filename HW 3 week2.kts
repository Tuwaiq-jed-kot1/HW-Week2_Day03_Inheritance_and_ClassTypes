/*## Part I - Practice with Inheritance.
---*/

open class Shape(){
    lateinit var shapeName : String
    lateinit var shapeColor : String
    open fun info(){
        println(" $shapeName And $shapeColor ")
    }
    open fun computeArea():Double{
        val pi : Double = 3.14
        var height : Double = 0.0
        var width : Double = 0.0
        var radius : Double = 0.0
        var base : Double = 0.0
        return 0.0
    }
}
class Rectangle:Shape(){
    override fun info(){
        println(" $shapeName And $shapeColor ")
    }

    override fun computeArea():Double{
        var height :Double= 5.0
        var width  :Double= 5.0
        var Rectangle =  height * width
        println("Rectangle area: $Rectangle")
        return Rectangle
    }
}
class Triangle:Shape(){
    override fun info(){
        println(" $shapeName And $shapeColor ")
    }

    override fun computeArea():Double{

        var height:Double = 10.0
        var base :Double = 10.0
        var triangle =((height * base)/2)
        println("Triangle area: $triangle")
        return triangle
    }
}
class Circle:Shape(){
    var radius : Double =5.00

    override fun info(){
        println(" $shapeName And $shapeColor ")
    }

    override fun computeArea():Double{

        val Pi = 3.14
        var circle=(Pi*(radius * radius ))
        println("Circle area: $circle ")
        return circle
    }
}
fun main() {

    val fa = Shape()
    fa.shapeName=" parallelogram  "
    fa.shapeColor=" Black  "
    println(fa.shapeName)
    println(fa.shapeColor)

    println() // Just to make a space

    var Rectangle = Rectangle()
    Rectangle.computeArea()
    println() // Just to make a space
    var Triangle =Triangle()
    Triangle.computeArea()
    println() // Just to make a space
    var circle =Circle()
    circle.computeArea()
}

----------------------------------------------------------------------------------------------------


/*## Part II - Practice with Class types.
---
### Open Questions:
- What is the difference between `enum classes` and `data classes`?

                           >>>>>>>>> `enum classes` <<<<<<<<<

Each enum constant is an object. Enum constants are separated by commas.
Each of the enum constants acts as separate instances of the class.
Enums are useful in enhancing the readability of your code since it assigns pre-defined names to constants.
Unlike classes, an instance of enum classes cannot be created using constructors.
Hence, we can assert that enum classes are abstract

                           >>>>>>>>> `data classes` <<<<<<<<<

The compiler automatically derives the following members from all properties declared in the primary constructor:

equals(),hashCode(),toString(),componentN(),copy()

The primary constructor needs to have at least one parameter.

All primary constructor parameters need to be marked as val or var.

Data classes cannot be abstract, open, sealed, or inner.


- Which one of the `object` keyword ways can be used for the inheritance concept?
object “ keyword can be used to create singleton objects.*/

