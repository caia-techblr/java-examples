import java.util.ArrayList;
public class ForEachDemo {
    public static void square(int val)
    {
        System.out.println(val*val);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i=1;i<=9;i++)
            nums.add(10*i); // { 10,20,30,40,50,60,70,80,90}

        nums.forEach(System.out::println);
        nums.forEach(ForEachDemo::square);
        nums.forEach( val -> { System.out.println(val + 5); } );
        nums.forEach( val -> { squares.add(val * val); } );
        System.out.println(squares);
    }
    
}
