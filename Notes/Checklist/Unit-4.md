* What are interfaces
* Simple example of creating interface and implementing by classes
* Interface references holding objects of implemented class
* A class implementing interface, but not implmenting those methods (considered as `abstract`)
* A class implementing multiple interfaces
* Variables/Data fields in Interface (static final)

## Advanced/Additional
* Inheriting interface (one interface extending other)
* Anonymous Objects

## Hands-on Problems (Scenario Based)
* Banking Accounts
    * Create an interface `IAccount` with methods : `credit` & `debit`
    * Implement `Account` class from `IAccount` (but not defining credit & debit)
        * data : id, name, balance
        * constructor (s)
        * Methods - `getBalance`, `toString`
    * Inherit `Account` class by `SavingsAccount`, `CreditAccount`
    * Override `credit` & `debit` methods in sub classes
    * In main, Create objects of `SavingsAccount`, `CreditAccount` which are held by `IAccount`, `Account` references and demonstrate polymorphism
* 2D Geometric Shapes
    * Create an interface `IShape` with two methods - `area` and `circumference`
    * Create `Polygon` class implementing `IShape` with data field : `nSides` and suitable construtor (but not defining area, circumference..so considered as abstract)
    * Inherit `Polygon` class by `Circle`, `Rectangle`, `Triangle` with suitable constructors and overriding `area`,`circumference` methods
    * Implement toString method in all classes
    * In main, Create objects of `Circle`, `Rectangle`, `Triangle` which are held by `IShape` or `Polygon` references and demonstrate polymorphism
* Mobile Billing
    * Create an interface `ICustomer` with two methods : `credit` & `debit`
    * Create `Customer` class implementing `ICsutomer` (considered as abstract)
        * data : id, name, phone number balance
        * constructor (s)
        * Non abstract methods - `getBalance`, `toString`
    * Inherit Customer class by `PrepaidCustomer`, `PostpaidCustomer` with suitable constructors
    * Override `credit` & `debit` methods in sub classes
    * Implement `toString` method in all classes
    * In main, Create objects of subclasses which are held by `ICustomer`, `Customer` references and demonstrate polymorphism

