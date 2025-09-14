import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        int[] original = new int[maxlen];
        for(int i=0; i<maxlen; i++) {
            original[i] = (int)(Math.random()*100);
        }
        
        // Copy the entire array
        int[] copy1 = Arrays.copyOf(original, original.length);
        
        // Copy a range of the array (from index 5 to 14)
        int[] copy2 = Arrays.copyOfRange(original, 5, 15);
        
        // Print the original and copied arrays
        System.out.println("Original array: " + java.util.Arrays.toString(original));
        System.out.println("Copy of entire array: " + java.util.Arrays.toString(copy1));
        System.out.println("Copy of range (5 to 14): " + java.util.Arrays.toString(copy2));
    }
}
