import java.util.ArrayList;

public class CapacityDemo {

    public static void ArrayListWithInitialCapacityDemo() {
        // Creating an ArrayList with initial capacity
        ArrayList<Integer> listWithCapacity = new ArrayList<>(20);
        System.out.println("ArrayList with initial capacity created.");

        // Fill the list with 20 elements (e.g., all zeros)
        for (int i = 0; i < 20; i++) {
            listWithCapacity.add(0);  // added within the initial capacity
        }
        System.out.println("Size of ArrayList, after add 20 times: " + listWithCapacity.size());
        for(int i=1;i<=15;i++) {
            listWithCapacity.add(i*10);
        }
        System.out.println("Size of ArrayList, after 15 more adds: " + listWithCapacity.size());
        System.out.println("Size of ArrayList: " + listWithCapacity.size());
    }

    public static void EnsureCapacityDemo()
    {
         ArrayList<Integer> iArray = new ArrayList<>();
         iArray.ensureCapacity(50);  
         iArray.add(11);
         iArray.add(12);
         iArray.add(13);
         iArray.add(14);
         iArray.add(15);
    }
    public static void main(String[] args) {
        
    }
}
