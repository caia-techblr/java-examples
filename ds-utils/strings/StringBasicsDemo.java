package ds-utils.strings;

public class StringBasicDemo {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, Java!");

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Character at a specific index
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));

        // Substring
        System.out.println("Substring of str1 from index 7 to 12: " + str1.substring(7, 12));

        // Concatenation
        String str3 = str1.concat(" Welcome to Java programming.");
        System.out.println("Concatenated string: " + str3);

        // Comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello, world!': " + str1.equalsIgnoreCase("hello, world!"));

        // Searching
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
        System.out.println("Index of 'Java' in str2: " + str2.indexOf("Java"));

        // Trimming whitespace
        String str4 = "   Hello, Trim!   ";
        System.out.println("Trimmed string: '" + str4.trim() + "'");

        // Replacing characters
        String str5 = str1.replace('o', '0');
        System.out.println("String after replacement: " + str5);

        // Splitting a string
        String[] words = str1.split(", ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
