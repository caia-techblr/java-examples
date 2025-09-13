package ds-utils.strings;

public class IndexDemo {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java Programming. Java is fun.";

        // indexOf() method
        int index1 = str.indexOf("Java");
        System.out.println("Index of first occurrence of 'Java': " + index1); // 21

        int indexNotFound = str.indexOf("Python");
        System.out.println("Index of 'Python' (not found): " + indexNotFound); // -1    

        int firstIndexOfJ = str.indexOf('J');
        System.out.println("Index of first occurrence of 'J': " + firstIndexOfJ);   // 21

        int secondIndexOfJ = str.indexOf('J', firstIndexOfJ + 1);
        System.out.println("Index of second occurrence of 'J': " + secondIndexOfJ);   // 36 

        int index2 = str.indexOf("Java", index1 + 1);
        System.out.println("Index of second occurrence of 'Java': " + index2); // 36

        // lastIndexOf() method
        int lastIndex = str.lastIndexOf("Java");
        System.out.println("Last index of 'Java': " + lastIndex); // 36

        
        int lastIndexOfJ = str.lastIndexOf('J');      
        System.out.println("Last index of 'J': " + lastIndexOfJ); // 36

        // charAt() method
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5); // ,

        // substring() method
        String substring1 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring1); // World

        String substring2 = str.substring(13);
        System.out.println("Substring from index 13 to end: " + substring2); //  Welcome to Java Programming. Java is fun.

        //Additional examples : subsequence
        CharSequence subSeq = str.subSequence(7, 12);
        System.out.println("Subsequence from index 7 to 12: " + subSeq); // World
       
    }
}
