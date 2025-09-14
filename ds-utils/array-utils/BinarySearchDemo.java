import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        int[] numbers = new int[maxlen];
        for(int i=0; i<maxlen; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        
        // Print the unsorted array
        System.out.println("Unsorted array: " + java.util.Arrays.toString(numbers));
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
        
        // Search for a specific value in the sorted array
        int target = numbers[(int)(Math.random()*maxlen)]; // Randomly pick a target from the array
        int index = Arrays.binarySearch(numbers, target);
        //int index = Arrays.binarySearch(numbers, 5, 10, target); // Search in a specific range  
        
        if(index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
