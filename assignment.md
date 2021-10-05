# Kotlin Essentials (Inheritance and Class types)
---
The Kotlin assignment has two components:
- Part I: Practice with Inheritance.
- Part II: Practice with Class types. 

## Part I - Practice with Inheritance.
---
![alt text](example.png)

To apply the Inheritance concept, create one superclass called `Shape` that has two properties called `shapeName` and `shapeColor`, and also has two functions one called `info()` that return name and color of shape and the other one called `computeArea()` that has no parameter, and return Double data type.

On the other hand, there are three subclasses that inherit from the superclass called `Triangle`, `Rectangle`, and `Circle`. Each subclass has different properties according to it. For example, Rectangle has `width` and `height` properties, Triangle has `base` and `height` properties, and Circle has `pi` and `radius` properties.

You need to change the body of `computeArea()` in each subclass to make sure this function will compute the area according to the subclass' name. For example, `computeArea()` in the `Triangle` subclass will calculate the triangle area, and so on.

```sh
Formulas to compute area:
`Circle area = pi times the radius squared (A = π*r²)`
`Rectangle area = height times width  (A = h * w)`
`Triangle area = half of height times base (A = (h * b)/2 )`
```


## Part II - Practice with Class types.
---
### Open Questions:
- What is the difference between `enum classes` and `data classes`?
- Which one of the `object` keyword ways can be used for the inheritance concept?


