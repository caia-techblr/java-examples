import java.util.ArrayList;

public class ArrayListInsertDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> iArray = new ArrayList<>();
        
        for(int i=1;i<=8;i++)
            iArray.add(11*i); // { 11, 22, 33, 44, 55, 66, 77, 88}
        System.out.println(iArray);
     
        iArray.add(3,35);
        System.out.println(iArray);

        ArrayList<Integer> secondArray = new ArrayList<>();
        secondArray.add(90);
        secondArray.add(91);
        secondArray.add(92);
        iArray.addAll(secondArray);
        System.out.println(iArray);

        ArrayList<Integer> thirdArray = new ArrayList<>();
        thirdArray.add(51);
        thirdArray.add(52);
        thirdArray.add(53);
        iArray.addAll(5,thirdArray);
        System.out.println(iArray);        
    }    
}
