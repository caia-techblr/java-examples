import java.util.Arrays;
import java.util.List;

public class ToListDemo {
    public static void main(String[] args) {
        int maxlen = 20;
        Integer[] numbers = new Integer[maxlen];
        for(int i=0; i<maxlen; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        
        // Convert array to list
        List<Integer> numberList = Arrays.asList(numbers);
        
        // Print the list
        System.out.println("List: " + numberList);
    }
}