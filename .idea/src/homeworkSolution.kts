
open class Shape(private val shapeName:String, private val shapeColor:String){

    fun info(){
        println(" The $shapeName is $shapeColor, The area is ${"%.2f".format(computeArea())}\n" +
                "*--------------------------------------------------*")
    }

    open fun computeArea(): Double {
        return 0.0
    }
}
// ------------------  subclasses  ----------------------


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

class Circle (shapeName: String,shapeColor: String,val radius:Double) : Shape(shapeName,shapeColor){

    override fun computeArea(): Double {
        val pi = 3.14
        return pi * (radius*radius)
    }
}

fun main(){
    println()
    val shape = Shape("The parent Shape","have no Color")
    shape.info()
    val myTriangle=Triangle("Triangle","Black",2.0,2.0)
    val myRectangle=Rectangle("Rectangle","White",5.5,6.0)
    val myCircle=Circle("Circle","Blue",2.5)
    myTriangle.info()
    myRectangle.info()
    myCircle.info()

    //-------
    //part 2


// Q1- What is the difference between enum classes and data classes?
//  1- enum class -> used to define a collection of constants with all possible values, so it limits the possible values
    /* 2- data class -> It is not unusual to create classes whose main purpose is to hold data.
          In such classes,some standard functionality and some utility functions are often mechanically derivable from the data.
          In Kotlin, these are called data classes and are marked with data:
   */
//----------------------------------------------------------------------------------------------------------------------
    //Q2- Which one of the object keyword ways can be used for the inheritance concept?
    //1- Open in parent class anf functions.
    //2- override in child class to change in functions or value

}