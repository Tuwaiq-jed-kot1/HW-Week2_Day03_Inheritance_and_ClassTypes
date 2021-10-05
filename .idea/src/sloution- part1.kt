
open class Shape(var shapeName: String, var shapeColor : String){

    open fun info(){
        val color =""
        val  shape = ""
    }

    open fun computeArea()  {

    }

}
class Triangle: Shape(shapeName = "Triangle", shapeColor = "Blue" ) {


    override fun computeArea()   {
        var base = 20.0
        var height = 30.6
        val a = 1.0 / 2.0 * base * height
        println(a)

    }


}

class Circle: Shape (shapeColor = "red", shapeName = "Circle") {

    override fun computeArea() {
        var r = 23.5
        var ae = Math.PI * r * r
        println(ae)
    }
}
class Rectangle: Shape (shapeName = "Rectangle", shapeColor = "yellow") {

    override fun computeArea()  {
        var width = 3.5
        var height = 6.7
        val rectangleArea = width * height
        println(rectangleArea)
    }
}

fun main (){

    val ti = Triangle()
    ti.computeArea()
    val ci = Circle()
    ci.computeArea()
    val  re = Rectangle()
    re.computeArea()


}
