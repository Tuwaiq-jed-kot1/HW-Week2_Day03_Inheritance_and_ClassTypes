
//assignment-8
fun main(){
    val triangle =Triangle("Red","Triangle" ,6.0,5.0)
    val circle =Circle("Blue","Circle" ,5.0)
    val rectangle =Rectangle("Green" ,"Rectangle",8.0,6.0)
    rectangle.info()
    println(" -the Area : ${rectangle.computeArea()}\n ---------*")
    circle.info()
    println(" -the Area : ${circle.computeArea()}\n ---------*")
    triangle.info()
    println(" -the Area : ${triangle.computeArea()}\n ---------*")

}

open class Shape(private val shapeName:String ,private val shapeColor:String){

    fun info(){
        println(" -the shape name is : $shapeName , shape color : $shapeColor")
    }
    open fun computeArea():Double{
        return 0.0
    }
}
class Circle(private val cColor:String,private val Cname:String,
             private val radius:Double):Shape(Cname,cColor){

    // fun
    override fun computeArea(): Double = 3.14*(radius*radius)
}
class Triangle(private val cColor:String,private val Cname:String,
               private val base:Double ,private val height:Double):Shape(Cname,cColor){

    //fun
    override fun computeArea(): Double = (height*base)/2
}
class Rectangle(private val cColor:String,private val Cname:String ,
                private val width :Double ,private val height: Double):Shape(Cname,cColor){
    //fun
    override fun computeArea(): Double = height*width

}
