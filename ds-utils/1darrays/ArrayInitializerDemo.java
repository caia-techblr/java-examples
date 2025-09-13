public class ArrayInitializerDemo {
    public static void main(String[] args) {
        // Creating arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World", "Java"};

        // Printing arrays
        System.out.print("Integer Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("String Array: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Length of arrays
        System.out.println("Length of Integer Array: " + intArray.length);
        System.out.println("Length of String Array: " + strArray.length);
    }   
}
