open class Shape(var shapeName:String="", var shapeColor:String="") {
    fun info (){
        println("$shapeName's color is $shapeColor ")
    }
    open fun computeArea(): Double{
        var area=2.1
        return area.toDouble()

    }    }

class Triangle(base:Int, height:Int):Shape("Triangle","Orange"){

    override fun computeArea():Double{
        var base= 4
        var tHieght=6
        var tArea= base*tHieght/2
        println("Rectangle area = $tArea")
        return tArea.toDouble()
    }
}

class Rectangle(width:Int, hieght:Int):Shape("rectangle","blue"){
    override fun computeArea():Double {
        var width = 4
        var rHieght = 8
        var rArea = (width * rHieght).toDouble()
        println("Rectangle area = $rArea")
        return rArea.toDouble()
    }
}
class Circle(pi:Double, radius:Int):Shape("circle","green"){
    override fun computeArea():Double{
        val PI = 3.14
        var radius = 2.times(2)
        var cArea=  PI * radius
        println("circle area = $cArea")
        return cArea.toDouble()
    }
}

fun main(){
    var circle = Circle(3.14,2)
    var rectangle= Rectangle(4,8)
    var triangle =Triangle(4,6)
    circle.info()
    rectangle.info()
    triangle.info()
    circle.computeArea()
    rectangle.computeArea()
    triangle.computeArea()
}
