
## Part I - Practice with Inheritance.
fun main(){
val shape = Shape("Shape","Colorless")
shape.computeArea()
shape.info()
val rectangle = Rectangle(6.5,5.0,"Rectangle","Cyan")
rectangle.info()
rectangle.printArea()
val triangle = Triangle(7.0,3.0,"Triangle","Orange")
triangle.info()
triangle.printArea()
val circle = Circle(3.14,8.5,"Circle","Green")
circle.info()
circle.printArea()

}
}








## Part II - Practice with Class types.
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
  Enumeration is a named list of constants. In Kotlin, like many other programming languages, 
- an enum has its own specialized type, indicating that something has a number of possible values. 
- Unlike Java enums, Kotlin enums are classes.
  Data class is a simple class which is used to hold data/state and contains standard functionality. 
- A data keyword is used to declare a class as a data class. 
- Declaring a data class must contains at least one primary constructor with property argument (val or var).
  Data class internally contains the following functions:
  • equals(): Boolean
  • hashCode(): Int
  • toString(): String
  • component() functions corresponding to the properties
  • copy()



- Which one of the `object` keyword ways can be used for the inheritance concept?
  all classes are final by default. To permit the derived class to inherit from the base class,
- we must use the open keyword in front of the base class.
- Kotlin Inheriting property and methods from base class: 
- When we inherit a class then all the properties and functions are also inherited.

