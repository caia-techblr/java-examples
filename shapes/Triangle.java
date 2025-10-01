package shapes;

enum TriangleType { EQUILATERAL, ISOSCELES, SCALENE, RIGHT_ANGLED }

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("All sides must be positive.");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Triangle inequality violated.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isIsosceles() {
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }

    public boolean isScalene() {
        return !isIsosceles();
    }

    public TriangleType getTriangleType() {
        if (isEquilateral()) {
            return TriangleType.EQUILATERAL;
        } else if (isIsosceles()) {
            return TriangleType.ISOSCELES;
        } else if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2) ||
                   Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2) ||
                   Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) {
            return TriangleType.RIGHT_ANGLED;
        } else {
            return TriangleType.SCALENE;
        }
    }

    @Override
    public String toString() {
        return "Triangle(sideA: " + sideA + ", sideB: " + sideB + ", sideC: " + sideC + ")";
    }
}
