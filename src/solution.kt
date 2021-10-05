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
//--------------------------Part2-----------------------------//

//What is the difference between enum classes and data classes?
/*Answer:Enum classes represent a concrete set of values,while sealed classes represent a concrete set of classes.
Enums have ordinal, and we can hold constant data by each item. They are perfect to represent a constant set of possible values.
The advantage of sealed classes is that they can hold instance-specific data.*/

//Which one of the object keyword ways can be used for the inheritance concept?
/*Answer: One of the keywords used for inheritance in Java is extends.
While in Kotlin we use "Open" before the parent class and link the child with ":"*/