open class Shape(private var shapName:String,private var shapeColor:String){
    fun info( ){
      println("name = $shapName ,color = $shapeColor")
   }
   open fun computeArea( ):Double{
return 0.0
   }

}
class circle(circelName:String,circelColor:String, var radius:Double):Shape(circelName,circelColor){
  private val pi=3.14
override fun computeArea():Double{
    var area=pi*(radius*radius)
    return area
}

}

class Triangel(triangelName:String,tringelcolor:String, var height:Double,var base:Double):Shape(triangelName,tringelcolor){
override fun computeArea():Double{

   var area=((height*base)/2)
    return area
}

}
class Rectangel(rectangelName:String,rectangelcolor:String,var height: Double , var width:Double):Shape(rectangelName,rectangelcolor){
    override fun computeArea():Double {
        println("height times width  (A = h * w)")
        var area=(height*width)
        return area
    }
}

fun main() {
    var tt=Triangel("trngel","red",17.6,6.3)
    println(tt.computeArea())
    tt.info()
}
//part2
//q1:enums are a simple way of getting "valuesless" (they are not really valueless, but for most cases the value doesnt matter) names. For example you can create an Enum
//It is not unusual to create classes whose main purpose is to hold data. In such classes, some standard functionality and some utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data:
//q2:object
