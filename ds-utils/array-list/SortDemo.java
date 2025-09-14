import java.util.ArrayList;

public class SortDemo {
    //sort Demo
    public static void main(String args[])
    {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=9;i++)
            nums.add((int)(Math.random()*100)); // { random numbers}

        System.out.println("Before Sort: " + nums);
        nums.sort(null); // Ascending order
        System.out.println("After Sort (Ascending): " + nums);
        //nums.sort((a,b) -> Integer.compare(a, b)); 
        nums.sort((a,b) -> b - a ); // Descending order
        System.out.println("After Sort (Descending): " + nums);

        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("orange");

        
        System.out.println("Before Sort: " + words);
        words.sort(null); // Ascending order
        System.out.println("After Sort (Ascending): " + words);
        words.sort((a,b) -> b.compareTo(a)); // Descending order
        System.out.println("After Sort (Descending): " + words);
        words.sort((a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println("After Sort (by length): " + words);
    }
}
