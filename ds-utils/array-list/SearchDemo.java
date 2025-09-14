import java.util.ArrayList;

public class SearchDemo {
    //indexOf, lastIndexOf, contains, subList
    public static void main(String args[])
    {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=9;i++)
            nums.add(10*i); // { 10,20,30,40,50,60,70,80,90}

        System.out.println(nums);
        System.out.println("Index of 50: " + nums.indexOf(50));
        System.out.println("Index of 100: " + nums.indexOf(100));
        nums.add(50);
        System.out.println(nums);
        System.out.println("Last Index of 50: " + nums.lastIndexOf(50));
        System.out.println("Contains 70? " + nums.contains(70));
        System.out.println("Contains 100? " + nums.contains(100));
        System.out.println("Sublist (2,6): " + nums.subList(2,6));
    }
}
