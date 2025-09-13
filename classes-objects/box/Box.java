public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(double len) {
        this(len, len, len);
    }
    Box() {
        this(1.0, 1.0, 1.0);
    }

    double volume() {
        return width * height * depth;
    }

    double surfaceArea() {
        return 2 * (width * height + height * depth + depth * width);
    }
       
    double perimeter() {
        return 4 * (width + height + depth);
    }
}

/*
@startuml
class Box {
    - double width
    - double height
    - double depth
    + Box(double w, double h, double d)
    + Box(double len)
    + Box()
    + double volume()
    + double surfaceArea()
    + double perimeter()
}
@enduml
*/
