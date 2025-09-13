package ds-utils.strings;

public class formattedStringDemo {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double height = 5.7;

        // Using String.format() to create a formatted string
        String formattedString = String.format("Name: %s, Age: %d, Height: %.1f feet", name, age, height);
        System.out.println(formattedString);

        // Using System.out.printf() to print a formatted string directly
        System.out.printf("Name: %s, Age: %d, Height: %.1f feet%n", name, age, height);

        int hours = 5;
        int minutes = 30;
        int seconds = 45;   
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
        System.out.printf("Hexadecimal representation of %d is %x%n", 255, 255);
        String timeString = String.format("Time: %02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timeString);
        String hexString = String.format("Hexadecimal representation of %d is %x", 255, 255);
        System.out.println(hexString);
    }   
}
