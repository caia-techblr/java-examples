# Lab Assignments

1. Design a class Student/Employee as follows
    * Attributes/Fields
        - Student/Trainee ID
        - Name
        - __Scores (in N subjects,array)__
        - __Skills (array of strings)__

    * Implement following methods
        - Constructor(s)
        - Initialize/Fill the scores
        - Add a skill
        - Print all skills in sorted order
        - Check if student is having specific skill
        - Remove a skill (* - after learning ArrayList)
        - Implement `toString` method

> Draw class diagram for the above (online tool like draw.io or smartdraw/plantuml)

* Plantuml code, put this code in https://www.plantuml.com/ or https://www.planttext.com/

```
@startuml
class Student {
    - id :String
    - name : String
    - scores : double[] 
    + Student(id:String, name:String, scores:double[])
    + addSkill(skill:String)   
    + removeSkill(skill:String)
    + isHavingSkill(skill:String) : boolean
    + printSkills()
    + toString() : String
}
@enduml
```

2. Design a class, to store temperature readings of City for a period of N days.
  * Attributes/Fields
    - cityName : String
    - __array of temperature readings__
  * Methods/Operations
    - Constructor(s)
    - Fill Readings
    - Find Average Temperature
    - Find Minimum Temperature
    - Find Maximum Temperature
    - Count the readings, above certain limit
    - Implement `toString` method

* Plantuml code

```
@startuml
class City {
    - id :String
    - name : String
    - scores : double[] 
    + City(name:String)
    + fillReadings(readings:double[])
    + findAverageTemperature():double
    + findMinimumTemperature():double
    + findMaximumTemperature():double
    + countTemperatureReadings(tlimit:double):int
    + toString():String
}
@enduml
```