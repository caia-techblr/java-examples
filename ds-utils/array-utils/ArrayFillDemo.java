import java.util.Arrays;

public class ArrayFillDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        int[] numbers = new int[maxlen];
        
        // Fill the array with a specific value, e.g., 7
        Arrays.fill(numbers, 7);
        Arrays.fill(numbers, 5, 10, 3); // Fill indices 5 to 9 with value 3
        
        // Print the filled array
        System.out.println("Filled array: " + java.util.Arrays.toString(numbers));
    }
}
