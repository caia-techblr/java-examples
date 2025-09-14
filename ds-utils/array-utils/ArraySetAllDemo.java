import java.util.Arrays;

public class ArraySetAllDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        int[] numbers = new int[maxlen];
        
        // Set all elements using a lambda expression
        Arrays.setAll(numbers, i -> (int)(Math.random()*100));
        Arrays.setAll(numbers, i -> i * i); // Set each element to its square of index 
        
        // Print the array
        System.out.println("Array after setAll: " + java.util.Arrays.toString(numbers));
    }
}
