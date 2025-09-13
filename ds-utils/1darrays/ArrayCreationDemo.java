public class ArrayCreationDemo {
    public static void main(String[] args) {
        // Creating arrays
        int ilength = 10;
        int[] intArray = new int[ilength]; // Array of integers with specified length   
        int slength = 5;
        String[] words = new String[slength]; // Array of strings with specified length  

        // Fill with random values
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 100); // Randomly assign value in the range 0-99
        }
        
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "This";
        words[3] = "Is";
        words[4] = "Java";

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

    }
}
