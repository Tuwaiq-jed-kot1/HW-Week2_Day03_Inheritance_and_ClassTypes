import kotlin.math.pow



//partI
open class Shape(private var shapeName: String, private var shapeColor:String ) {
    open fun computeArea(): Double{
        return 0.0
    }


    fun info() {

        println("the name of the shape is $shapeName and it colors $shapeColor ")
    }
}

class Triangle (shapeName_T: String,  shapeColor_T: String, private val base : Double, private val height_T : Double ) : Shape(shapeName_T,shapeColor_T) {

    override fun computeArea(): Double {
        return (height_T * base)/2

    }

}
class Rectangle  (shapeName_R: String,  shapeColor_R: String,private val width : Double, private val height_R : Double) : Shape(shapeName_R,shapeColor_R) {


    override fun computeArea(): Double {
        return (height_R * width)

    }

}
class Circle  (shapeName_C: String,  shapeColor_C: String, private val radius : Double) : Shape(shapeName_C,shapeColor_C) {
    private val pi : Double = 3.14

    override fun computeArea(): Double {
        return pi*radius.pow(2)
    }

}

fun main() {

    val rec = Rectangle("rectangle","black",5.0,7.5)
    val circle = Circle("circle","white",6.0)
    val tri = Triangle("triangle","blue",7.0,8.5)
    //print information message
    rec.info()
    circle.info()
    tri.info()
    //for space
    println("")
    //print the area calculation
    println("circle area =${circle.computeArea()}\n")
    println("rectangle area =${rec.computeArea()}\n")
    println("triangle area =${tri.computeArea()}\n")


    //partII
    println("What is the difference between enum classes and data classes?")
    println("\t enum are static and fixed so you can't add or do changes at briefly it is immutable, it even can't be override, " +
            "you can apply interface on it but can't extend classes\n")
    println("\t data classes can have immense amount of self-generated code, like equals(),toString() and so on," +
            " is must have at least one parameter at the primary constructor," +
            " the data class can implement interface and have the ability to extend classes\n")
    println("")
    println("Which one of the object keyword ways can be used for the inheritance concept?")
    println("\t object keyword which known as a special class with only one instance and type of it implementation called singleton ")

}