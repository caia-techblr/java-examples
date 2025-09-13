package box;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(2.0, 3.0, 4.0);
        Box box2 = new Box(5.0);
        Box box3 = new Box();

        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Surface Area of Box 1: " + box1.surfaceArea());
        System.out.println("Perimeter of Box 1: " + box1.perimeter());

        System.out.println("Volume of Box 2: " + box2.volume());
        System.out.println("Surface Area of Box 2: " + box2.surfaceArea());
        System.out.println("Perimeter of Box 2: " + box2.perimeter());

        System.out.println("Volume of Box 3: " + box3.volume());
        System.out.println("Surface Area of Box 3: " + box3.surfaceArea());
        System.out.println("Perimeter of Box 3: " + box3.perimeter());
    }
}
