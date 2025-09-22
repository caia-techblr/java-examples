public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;
    Triangle( double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }   
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    
}
