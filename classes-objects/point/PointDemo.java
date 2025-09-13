package point;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-1, -1);
        
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        
        System.out.println("Distance from Origin to Point 1: " + p1.distanceFromOrigin());
        System.out.println("Distance from Origin to Point 2: " + p2.distanceFromOrigin());
        
        System.out.println("Distance between Point 1 and Point 2: " + p1.distanceFromOther(p2));
        
        System.out.println("Quadrant of Point 1: " + p1.getQuadrant());
        System.out.println("Quadrant of Point 2: " + p2.getQuadrant());
    }
}
