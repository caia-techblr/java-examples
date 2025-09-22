## Object Oriented Principles
* Data Abstraction - Encapsulation & Data Hiding
* Inheritance
* Polymorphism

## Classes & Objects
* What is a class?
* What is an object?
* Explain about public & private access specifiers
* How do you create an Object - references and dynamic object, explain with example syntax
* Where do object references and actual objects are stored
* What is a constructor, syntax to define a parameterized constructor for any class
* What is default constructor?
* What is copy constructor?
* Explain method overloading.
* What are the 2-3 usages of this keyword?
* Can class member variables (fields) assigned values within the class (field initializer)?
* In case of field initializer value and initialization inside the constructor, which value will be taken by fields?
* What are static variables?
* What are static methods?
* How static initializer block works for any class
* Do a static method can access non-static variable/non-static method?
* What are final variables?
* What is the role of garbage collector(GC)?
* When do objects memory will be cleaned by GC?
* Do objects are passed by value / reference in Java?

# Wrapper classes
* Need for wrapper classes like Integer, Float, Double
* How to convert primitive type into Wrapper class object, e.g. int to Integer, Integer.valueOf
* How to extract primitive type value from Wrapper class object. e.g. Integer to int, Integer.parseInt
* How Auto boxing & Auto unboxing works?

## Advanced/Additional
* Factory Pattern - private constructor + Usage of static methods to create objects
* Singleton Pattern -  private constructor + Usage of static methods to create objects + static reference to ensure only one object is created
* If a file is opened instructor inside the constructor of the class, how that can be closed automatically when object is cleaned up by GC? (Hint - finalize method)
* Can you return an object from a method, if so is it by value/reference?
* What will happen if any field is not initialized inside the constructor (and not specified any initial value )
* What will happen if any method is invoked with `null` reference (reference assigned null value)
* Can two reference holds same object, if so when the object memory will be cleaned by GC