
## Part I - Practice with Inheritance.
//--------------------------Part1-----------------------------//
//Formulas to compute area:
//`Circle area = pi times the radius squared (A = π*r²)`
//`Rectangle area = height times width  (A = h * w)`
//`Triangle area = half of height times base (A = (h * b)/2 )`
//------------------------------------------------------------//
//We create a superclass with signatures to give to the subclasses
open class Shape( private val shapeName:String, private val shapeColor:String){

    fun info(){
        println("Shapes Information Status:-\n Shape Name:\t$shapeName\n Shape Color:\t$shapeColor")
    }
    open fun computeArea():Double{
        println("Welcome Mr. Anas to the area of shape calculator!!" +
                "\n------------------------------------------------")
        return 0.0
    }
    fun printArea() = println("The area of $shapeName is =\t${this.computeArea()}")

// We create three subclasses and override the computeArea function to produce different results
}

class Rectangle( private val width:Double, private val height:Double,shapeName: String,shapeColor: String) : Shape(shapeName,shapeColor){
override fun computeArea():Double{
return width * height
}

}
class Triangle( private val base:Double,private val height:Double,shapeName: String,shapeColor: String) : Shape(shapeName,shapeColor){
override fun computeArea():Double{
return (height * base)/2
}

}
class Circle(private val pi:Double = Math.PI,private val radius:Double, shapeName: String,shapeColor: String) : Shape(shapeName,shapeColor){
override fun computeArea():Double{
return pi * (radius*radius)
}

}
// We just create object out of the classes and give call them to print
fun main(){
val shape = Shape("Shape","Colorless")
shape.computeArea()
shape.info()
println("------------------------------")

    val rectangle = Rectangle(5.5,4.0,"Rectangle","Cyan")
    rectangle.info()
    rectangle.printArea()
    println("------------------------------")

    val triangle = Triangle(6.0,2.0,"Triangle","Orange")
    triangle.info()
    triangle.printArea()
    println("------------------------------")

    val circle = Circle(3.14,7.5,"Circle","Green")
    circle.info()
    circle.printArea()
    println("------------------------------")
}








## Part II - Practice with Class types.
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
  Enumeration is a named list of constants. In Kotlin, like many other programming languages, 
- an enum has its own specialized type, indicating that something has a number of possible values. 
- Unlike Java enums, Kotlin enums are classes.
  Data class is a simple class which is used to hold data/state and contains standard functionality. 
- A data keyword is used to declare a class as a data class. 
- Declaring a data class must contains at least one primary constructor with property argument (val or var).
  Data class internally contains the following functions:
  • equals(): Boolean
  • hashCode(): Int
  • toString(): String
  • component() functions corresponding to the properties
  • copy()



- Which one of the `object` keyword ways can be used for the inheritance concept?
  all classes are final by default. To permit the derived class to inherit from the base class,
- we must use the open keyword in front of the base class.
- Kotlin Inheriting property and methods from base class: 
- When we inherit a class then all the properties and functions are also inherited.

