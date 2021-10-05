//What is the difference between enum classes and data classes ?
// The only difference is that enum constants are public , static and final (unchangeable - cannot be overridden).
// An enum cannot be used to create objects, and it cannot extend other classes

// data classes
// it gives us The properties declared in the constructor: this technically is not exclusive to a data class,
// but it avoids all the boilerplate of getters and setters, in addition to the constructor
// A copy() method, very useful when we use immutable objects

// Which one of the object keyword ways can be used for the inheritance concept ?
//Companion Objects