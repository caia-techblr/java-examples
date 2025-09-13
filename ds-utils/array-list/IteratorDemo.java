import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorDemo {
    public static void main(String[] args) {
        stringListIteratorDemo();
        integerListIteratorDemo();
    }
    public static void integerListIteratorDemo() {
        // Creating an ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();

        // Adding elements to the ArrayList
        intList.add(11);  //Auto-boxing : intList.add(Integer.valueOf(11));
        intList.add(22);
        intList.add(33);

        // Using an iterator to traverse the ArrayList
        Iterator<Integer> iterator = intList.iterator();
        System.out.println("Integer ArrayList elements using Iterator:");
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element); 
            // sum += element;   // Auto-unboxing : sum += element.intValue();    
        }
    }   
    public static void listIteratorDemo()
    {
        ArrayList<Integer> intList = new ArrayList<>();

        for(int i=1;i<=9;i++)
            intList.add(11*i); // { 11, 22, 33, 44, 55, 66, 77, 88, 99}

        ListIterator<Integer> iter = intList.listIterator(5);
        while (iter.hasPrevious()) {    //hasNext
            Integer element = iter.previous();  //next
            System.out.println(element); 
            // sum += element;   // Auto-unboxing : sum += element.intValue();    
        }
         
    }
    public static void stringListIteratorDemo() {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("CSE");
        list.add("EECE");
        list.add("CIVIL");
        list.add("MECH");

        // Using an iterator to traverse the ArrayList
        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList elements using Iterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }   
}
