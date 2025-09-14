import java.util.ArrayList;

//replaceAll, retainAll, set
public class ReplaceRetainDemo {
    
    public static void main(String args[])
    {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=9;i++)
            nums.add(10*i); // { 10,20,30,40,50,60,70,80,90}

        System.out.println("Original List: " + nums);
        nums.replaceAll( val -> val + 5 ); // Add 5 to each element
        System.out.println("After replaceAll (+5): " + nums);
        
        ArrayList<Integer> evens = new ArrayList<>();
        evens.add(20);
        evens.add(40);
        evens.add(60);
        evens.add(80);
        System.out.println("Evens List: " + evens);
        
        nums.retainAll(evens); // Retain only even numbers in nums
        System.out.println("After retainAll (evens): " + nums);
        
        nums.set(0, 100); // Set first element to 100
        System.out.println("After set(0, 100): " + nums);
    }   
}
