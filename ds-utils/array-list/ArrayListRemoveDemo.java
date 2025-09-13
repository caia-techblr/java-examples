import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String args[])
    {
        ArrayList<Integer> iArray = new ArrayList<>();
        
        for(int i=1;i<=9;i++)
            iArray.add(11*i); // { 11, 22, 33, 44, 55, 66, 77, 88, 99}

        iArray.remove(4);  //Index:4, Value: 55 will be removed

        iArray.remove(Integer.valueOf(77));

        //TODO : removeAll, removeIf, removeRange, clear

        System.out.println(iArray);
    }    
}
