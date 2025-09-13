package ds-utils.strings;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java Programming. Java is fun.";

        // replace() method
        String replacedStr1 = str.replace("Java", "Python");
        System.out.println("After replacing 'Java' with 'Python': " + replacedStr1);
        // Hello, World! Welcome to Python Programming. Python is fun.

        // replaceAll() method (using regex)
        String replacedStr2 = str.replaceAll("Java", "C++");
        System.out.println("After replacing all occurrences of 'Java' with 'C++': " + replacedStr2);
        // Hello, World! Welcome to C++ Programming. C++ is fun.

        // replaceFirst() method (using regex)
        String replacedStr3 = str.replaceFirst("Java", "JavaScript");
        System.out.println("After replacing first occurrence of 'Java' with 'JavaScript': " + replacedStr3);
        // Hello, World! Welcome to JavaScript Programming. Java is fun.
    }
}
