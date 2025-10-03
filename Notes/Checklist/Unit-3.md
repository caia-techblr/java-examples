## Inheritance
* What is inheritance
* is-a relationship
* Types of Inheritance : Single, Multiple, Multilevel
* Real-life examples of Single, Multilevel inheritance
* Do java supports multiple inheritance using classes

## Java support
* Java syntax for inheriting one class from other
* Role of super keyword - Invoking super class constructor, explicit access to super class members
* Can super class reference holds sub class object?
* Can sub class reference holds super class object
* If super class reference holds sub class object, and a method is overridden , which method will be executed
* What are abstract methodas
* What are abstract classes and their purpose
* Class B, extending abstract class A, but not overriding all abstract methods. Can we create objects from class B
* What are final methods, can you override final methods in sub classes?
* What are final classes, can you inherit (create sub classes) from final classes

## Advanced/Additional
* What is the use/significance of abstract classes, if they can't create objects
* Why to declare abstract methods in abstract class, when objects are not created from such class
* How abstract class play crucial role in Polymorphism.
* Do abstract classes can have non-abstract methods, if so what's their purpose?
* Do abstract classes can have constructors, if what's their purpose?
* `Object` class - origin of all classes
* Important methods of `Object` class, e.g. toString, hashCode, equals
* What are wrong examples inheritance (Hint:- has-a / part-of relationship 
* When to avoid inheritance(is-a) and go for composition(part-of)/aggregation(has-a)

## Hands-on Problems (Scenario Based)
* Banking Accounts
    * Create `Account` class as abstract
        * data : id, name, balance
        * constructor (s)
        * with two abstract methods - `credit` & `debit`
        * Non abstract methods - `getBalance`, `toString`
    * Inherit `Account` class by `SavingsAccount`, `CreditAccount`
    * Override `credit` & `debit` methods in sub classes
    * In main, Create objects of subclasses which are held by super class references and demonstrate polymorphism
* 2D Geometric Shapes
    * Create abstract class `Shape` with two abstract methods - `area` and `circumference`
    * Create `Polygon` class inheriting `Shape` with data field : `nSides` and suitable construtor
    * Inherit `Polygon` class by `Circle`, `Rectangle`, `Triangle` with suitable constructors and overriding `area`,`circumference` methods
    * Implement toString method in all classes
    * In main, Create objects of `Circle`, `Rectangle`, `Triangle` which are held by Shape or Polygon references and demonstrate polymorphism
* Mobile Billing
  * Create Customer class as abstract
        * data : id, name, phone number balance
        * constructor (s)
        * Add two abstract methods - `credit` & `debit`
        * Non abstract methods - `getBalance`, `toString`
    * Inherit `Customer` class by `PrepaidCustomer`, `PostpaidCustomer` with suitable constructors
    * Override `credit` & `debit` methods in sub classes
    * Implement `toString` method in all classes
    * In main, Create objects of subclasses which are held by super class references and demonstrate polymorphism
