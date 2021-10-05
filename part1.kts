package Day3.HW3

import Day3.Animal
import java.awt.Color


open class Shape(){

    lateinit var shapeName:String
    lateinit var shapeColor: String


    open fun info(){

        println("info1")
        println("shep name : $shapeName   shepe color $shapeColor")

    }

    open fun computeArea():Double{
        println("computeAre2")

        var width:Double=5.0
        var height:Double=10.0

        var radius :Double=10.0
        var pi  :Double=10.0

        var base :Double=10.0


        return 0.0



    }

}

class Rectangle(_type:String):Shape(){

    override fun info(){

        println("info2")

        println("shep name : $shapeName   shepe color $shapeColor")


    }

    override fun computeArea():Double{
        println("computeArea2")
        var height :Double=5.0
        var width  :Double=10.0
        //`Rectangle area = height times width  (A = h * w)`

        var A=width*height

        println(A)
        return A

    }

}

class Triangle(_type:String):Shape(){


    override fun info(){

        println("info2")

        println("shep name : $shapeName   shepe color $shapeColor")


    }


    override fun computeArea():Double{
        println("computeArea2")

        var height:Double=5.0
        var base :Double=10.0
        //`Triangle area = half of height times base (A = (h * b)/2 )`

        var triangle =((height * base)/2)

        println("Triangle area $triangle")
        return triangle

    }

}



class Circle(_type:String):Shape(){


    var radius :Double=3.0



    override fun info(){

        println("info2")

        println("shep name : $shapeName   shepe color $shapeColor")


    }


    override fun computeArea():Double{
        println("computeArea2")

        //`Circle area = pi times the radius squared (A = π*r²)`


        val PI = 3.14
        var circle=(PI*(radius * radius ))
        println("Circle area ")
        return circle

    }

}


fun main() {

    //val animal1 = Animal("dog")
    val v = Shape()
    v.shapeName="shep 1"
    v.shapeColor="red"

    println(v.shapeColor)
    v.computeArea()


    println("-------------------------------------------")

    var Rectangle =Rectangle("Rectangle ")
    Rectangle.computeArea()

    println("-------------------------------------------")


    var Triangle =Triangle("Triangle area")
    println( Triangle.computeArea())

    println("-------------------------------------------")


    var circle =Circle("Circle area ")

    println(circle.computeArea())
}