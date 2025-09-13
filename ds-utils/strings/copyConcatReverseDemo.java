package ds-utils.strings;

public class copyConcatReverseDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Copying strings
        String copiedStr = new String(str1);
        System.out.println("Copied String: " + copiedStr);

        // Concatenating strings
        String concatenatedStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedStr);

        // Reversing a string, note: String is immutable, no reverse method in String class
        // We can use StringBuilder to acheive this
        String reversedStr = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
    }
}
