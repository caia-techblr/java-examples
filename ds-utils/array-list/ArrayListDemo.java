import java.util.ArrayList;

public class ArrayListDemo {
    public static void stringArrayListDemo() {
        // Creating an ArrayList
        ArrayList<String> departmentList = new ArrayList<>();

        // Adding elements to the ArrayList
        departmentList.add("CSE");
        departmentList.add("EECE");
        departmentList.add("CIVIL");
        departmentList.add("MECH");

        // Printing the ArrayList
        System.out.println("ArrayList: " + departmentList);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + departmentList.size());

        //get
        String val = departmentList.get(2);
        String res = departmentList.get(9);
        
    }
    public static void integerArrayListDemo() {
        // Creating an ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();

        // Adding elements to the ArrayList
        intList.add(11);  //Auto-boxing : intList.add(Integer.valueOf(11));
        intList.add(22);
        intList.add(33);

        // Printing the ArrayList
        System.out.println("Integer ArrayList: " + intList);

        // Size of the ArrayList
        System.out.println("Size of Integer ArrayList: " + intList.size());

        int val = intList.get(2);
        int res = intList.get(9);
    }   
    
    public static void main(String[] args) {
        stringArrayListDemo();
        integerArrayListDemo();
    }
}
