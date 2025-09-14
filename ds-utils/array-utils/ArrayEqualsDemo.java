import java.util.Arrays;

public class ArrayEqualsDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        int[] array1 = new int[maxlen];
        int[] array2 = new int[maxlen];
        int[] array3 = new int[maxlen];
        for(int i=0; i<maxlen; i++) {
            array1[i] = (int)(Math.random()*100);
            array2[i] = array1[i]; // Make array2 identical to array1
            array3[i] = (int)(Math.random()*100); // Different random values
        }
        
        // Check if the two arrays are equal
        boolean areEqual = Arrays.equals(array1, array2);
        
        System.out.println("array1 and array2 equal? " + areEqual);

        areEqual = Arrays.equals(array1, array3);
        System.out.println("array1 and array3 are equal? " + areEqual);
    }
}
