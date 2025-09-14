import java.util.Arrays;
public class ArraySortDemo {
    public static void main(String[] args) {
        
        //int[] numbers = {5, 2, 8, 1, 3};
        int maxlen = 20;
        int[] numbers = new int[maxlen];
        for(int i=0; i<maxlen; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
    
        int largeArray[] = new int[100000];
        for(int i=0; i<largeArray.length; i++) {
            largeArray[i] = (int)(Math.random()*100000);    
        }

        String[] words = {"banana", "apple", "orange", "kiwi", "grape"};
        //Arrays.sort(words);
        //Arrays.sort(words, (a, b) -> b.compareTo(a)); // Sort in descending order
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted words: " + java.util.Arrays.toString(words));

        long startTime = System.nanoTime();
        Arrays.sort(largeArray);
        long endTime = System.nanoTime();   
        long duration = endTime - startTime; // Duration in nanoseconds
        System.out.println("Time taken to sort large array: " + duration + " nanoseconds");

        startTime = System.nanoTime();
        Arrays.parallelSort(largeArray);
        endTime = System.nanoTime();   
        duration = endTime - startTime; // Duration in nanoseconds
        System.out.println("Time taken to parallel sort large array: " + duration + " nanoseconds");
    }
}