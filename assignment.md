

//////////Part I - Practice with Inheritance.///////
///////////super class////////////////////
open class Shape( val shape_name: String,  val shape_color: String ) {  //super class + properties


        // first function /////
     fun info( ){
            println ("the name of shape is $shape_name  and the color is $shape_color")

     } //end of 1 function

    // second  function /////

    open fun comput_Area( ):Double {

     return 0.00

    }//end of sconde  function


    open fun computArea(): Double {
        TODO("Not yet implemented")
    }
}//end of super class//////////////////////////////////////////////////////////////////////////


///////////first chiled is  the Triangle is  /////////

class Triangle( name:String,color:String, var base_t : Double ,var hight_t:Double ) :Shape( name, color) {
// var base_tt = Double
//var hight_t = Double

      override fun computArea( ):Double {
          return ((base_t * hight_t) / 2)
      }
}


///////////second supclass/////////

      class Rectangle( name:String,color:String , var width_r :Double , var hight_r: Double ) :Shape( name, color) {

          override fun computArea( ):Double {
          return (hight_r * width_r )/2

          }//end of second  function
      }


///////////Thride supclass/////////

      class Circle( name:String,color:String ,var radiusc : Double) :Shape( name, color) {
          // var Pi: Double = 3.14
          override fun computArea() :Double{
            return (3.14 * (radiusc * radiusc))

          }//end of second  function

      }

    fun main (){
        /////////////the triangle//////////
        val tri =Triangle("TT","GREEN " ,2.2,3.3)
        tri.info()
        println("Triangle area is : ${tri.computArea()}")

        //////////// the  Rectangle ////////////

        val rec =Rectangle("RR","RED " ,4.4,5.5)
        rec.info()
        println("Rectangle area is : ${rec.computArea()}")

        //////////// the   ////////////

        val cirl =Circle("CC","BLUE " ,6.6)
        cirl.info()
        println("Circle area is : ${cirl.computArea()}")
    }

////// Part II - Practice with Class types./////
/*
* What is the difference between enum classes and data classes?
*
* Enum classes represent a concrete set of values, while sealed classes represent a concrete set of classes.
*  Since those classes can be object declarations, we can use sealed classes to a certain degree instead of enums,
*  but not the other way around.
   The advantage of enum classes is that they can be serialized and deserialized out of the box.
*   They are perfect to represent a constant set of possible values.
    The advantage of sealed classes is that they can hold instance-specific data.
*  They are also great to define a set of events or messages that might occur.
    *
    *
    *
    Which one of the object keyword ways can be used for the inheritance concept?
    * the open keyword
    *
    * */


