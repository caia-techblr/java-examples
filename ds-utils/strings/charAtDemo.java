package ds-utils.strings;

public class charAtDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        char c1 = str.charAt(20); // This will throw StringIndexOutOfBoundsException    
        char c2 = str.charAt(-5); // This will also throw StringIndexOutOfBoundsException   

    }

}
