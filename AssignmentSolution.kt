/*
# Kotlin Essentials (Inheritance and Class types)
The Kotlin assignment has two components:

Part I: Practice with Inheritance.
Part II: Practice with Class types.





## Part I - Practice with Inheritance.
alt text

To apply the Inheritance concept, create one superclass called Shape that has two properties called shapeName and shapeColor,
 and also has two functions one called info() that return name and color of shape
  and the other one called computeArea() that has no parameter, and return Double data type.

On the other hand, there are three subclasses that inherit from the superclass
 called Triangle, Rectangle, and Circle.
 Each subclass has different properties according to it.
  For example, Rectangle has width and height properties,
   Triangle has base and height properties,
    and Circle has pi and radius properties.

You need to change the body of computeArea() in each subclass
 to make sure this function will compute the area according to the subclass' name.
  For example, computeArea() in the Triangle subclass will calculate the triangle area, and so on.

Formulas to compute area:
`Circle area = pi times the radius squared (A = π*r²)`
`Rectangle area = height times width  (A = h * w)`
`Triangle area = half of height times base (A = (h * b)/2 )`
*/
//## Part I - Practice with Inheritance:
import kotlin.math.PI
import kotlin.math.sqrt
// create one superclass called Shape that has two properties called shapeName and shapeColor
open class Shape(var shapeName: String, var shapeColor: String) {

    //also has two functions one called info() that return name and color of shape
    fun info(shapeName: String, shapeColor: String): String {
        return "SuperClass: Shape name is $shapeName & its color is $shapeColor"
    }

    //and the other one called computeArea() that has no parameter, and return Double data type
    open fun computeArea(): Double {
        //println("SuperClass: This function computes area of $shapeName")
        return 0.0}
}

// three subclasses that inherit from the superclass
// called Triangle, Rectangle, and Circle.

//Triangle has base and height properties,
class Triangle(_shapeName: String, _shapeColor: String) : Shape(_shapeName, _shapeColor){
    var triangleBase:Double=5.0
    var triangleHeight:Double=5.0
    //`Triangle area = half of height times base (A = (h * b)/2 )`
    var triangleArea:Double=(triangleHeight*triangleBase)/2

    override fun computeArea(): Double {
        return triangleArea
    }

}

//Rectangle has width and height properties,
class Rectangle(_shapeName: String, _shapeColor: String) : Shape(_shapeName, _shapeColor){
    var rectangleHeight:Double=5.0
    var rectangleBase:Double=5.0

    //`Rectangle area = height times width  (A = h * w)`

    var rectangleArea:Double=rectangleHeight*rectangleBase

    override fun computeArea(): Double {
        return rectangleArea
    }
}

//and Circle has pi and radius properties.
class Circle(_shapeName: String, _shapeColor: String) : Shape(_shapeName, _shapeColor){
    var radius:Double=Math.sqrt(5.0)
    val pi:Double=Math.PI

    //`Circle area = pi times the radius squared (A = π*r²)`
    var circleArea:Double=pi*radius

    override fun computeArea(): Double {
        return circleArea
    }
}

fun main() {
    val triangle = Triangle("Triangle", "Orange")
    val rectangle = Rectangle("Rectangle", "Blue")
    val circle = Circle("Circle", "Green")

    println("Area of a triangle height of 5 & base of 5= ${triangle.computeArea()}")
    println("Area of a rectangle height of 5 & width of 5= ${rectangle.computeArea()}")
    println("Area of a circle radius of 5= ${triangle.computeArea()}")
}

/*
## Part II - Practice with Class types.

Open Questions:
What is the difference between enum classes and data classes?
data classes are used to store data, whereas enum classes are also used to store data but for constant data; like days of the week

Which one of the object keyword ways can be used for the inheritance concept?
anonymous objects, companion objects
*/

