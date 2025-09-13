public class StringCreationLengthPrinting {
    public static void main(String[] args) {
        // Creating strings

        String str0 = new String(); // empty string
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");
        char charArray[] = {'A', 'B', 'C', 'D', 'X' , 'Y', 'Z'};
        String str3 = new String(charArray);
        //String str3 = new String(new char[] {'A', 'B', 'C', 'D'});

        // Printing strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 2: " + str3);
        System.out.println("Empty String : " + str0);

        // Length of strings
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());
        System.out.println("Length of String 2: " + str3.length());
        System.out.println("Length of Empty String: " + str0.length());
        
        //isEmpty() method
        System.out.println("Is String 1 empty? : " + str1.isEmpty());
        System.out.println("Is Empty String empty? : " + str0.isEmpty());

        //ADDITIONAL: create string using sub array of char array, String(char[] value, int offset, int count)
        //ADDITIONAL: create string using byte array, String(byte[] bytes)
        //ADDITIONAL: create string using sub array of byte array, String(byte[] bytes, int offset, int length)
        //ADDITIONAL: create string using StringBuilder/StringBuffer, String(StringBuffer buffer), String(StringBuilder buffer)
        //ADDITIONAL: create string using StringJoiner
        //ADDITIONAL: create string using code points
    }
}
