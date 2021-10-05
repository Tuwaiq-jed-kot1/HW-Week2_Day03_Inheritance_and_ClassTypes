//Part I
open class Shape(var shapeName:String, var shapeColor:String){
  fun info():String{
    return "The name of the shape is $shapeName and it's color is $shapeColor."
  }

  open fun computeArea():Double{
    return 0.0
  }
}

  class Rectangle(var width:Double, var height: Double): Shape("Rectangle", "Blue"){
    override fun computeArea(): Double {
      return width * height
    }
  }

  class Triangle(var base:Double, var height: Double): Shape("Triangle", "Orange"){
    override fun computeArea():Double{
      return ((height * base) /2)
    }
  }

  class Circle(var radius: Double): Shape("Circle", "Green"){
    var PI:Double = 3.14
    override fun computeArea():Double{
      return  PI * (radius * radius)
    }
  }

fun main() {
  val circle = Circle(3.0)
  println(circle.info())
  println("Circle area equals to ${circle.computeArea()}\n")


  val triangle = Triangle(1.2, 4.7)
  println(triangle.info())
  println("Triangle area equals to ${triangle.computeArea()}\n")


  val rectangle = Rectangle(5.5, 3.1)
  println(rectangle.info())
  println("Rectangle area equals to ${rectangle.computeArea()}\n")

}

//Part II
/*
What is the difference between enum classes and data classes?
-Answer: Enum classes hold constants data that will never be changed like days, months names and
planets but, data classes main purpose is to hold data also data classes cannot be abstract, open or sealed.

Which one of the object keyword ways can be used for the inheritance concept?
-Answer: "override" for the functions and "open" for classes.

Why OOP is bad?
-Answer: Because it makes the code unreliable, OO forces you to think of everything as an object and OO is not bad
but the bad is to teach OOP as the only way to develop or write a code which will limited the way the developer think
about things OO is just one of many options and is not always the best one.
“The phrase "object-oriented” means a lot of things. Half are obvious, and the other half are mistakes.“
– Paul Graham
Computer scientist
* */

