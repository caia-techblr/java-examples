public class StringBufferDemo {

    public static void creationAndPrinting() {
        StringBuffer sb = new StringBuffer();
        System.out.println("Empty StringBuffer: '" + sb + "'");

        StringBuffer sbWithContent = new StringBuffer("Hello World");
        System.out.println("StringBuffer with initial content: '" + sbWithContent + "'");

        String str = "Hello World";
        StringBuffer sbFromString = new StringBuffer(str);
        System.out.println("StringBuffer from String: '" + sbFromString + "'");
    
        StringBuffer sbWithCapacity = new StringBuffer(50);
        System.out.println("StringBuffer with capacity 50: '" + sbWithCapacity + "'");
    }

    public static void lengthAndCapacity() {

        StringBuffer sbEmpty = new StringBuffer();
        System.out.println("Length: " + sbEmpty.length());
        System.out.println("Capacity: " + sbEmpty.capacity());

        StringBuffer sbFromString = new StringBuffer("Hello");
        System.out.println("Length: " + sbFromString.length());
        System.out.println("Capacity: " + sbFromString.capacity());

        sbFromString.append(" World! This is a test of StringBuffer.");
        System.out.println("Length: " + sbFromString.length());
        System.out.println("Capacity: " + sbFromString.capacity());

        StringBuffer sbWithCapacity = new StringBuffer(50);
        System.out.println("Capacity: " + sbWithCapacity.length());
        System.out.println("Capacity: " + sbWithCapacity.capacity());   
    }

    public static void setLengthExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original: '" + sb + "' with length " + sb.length());

        sb.setLength(5);
        System.out.println("After setLength(5): '" + sb + "' with length " + sb.length());

        sb.setLength(10);
        System.out.println("After setLength(10): '" + sb + "' with length " + sb.length());
    }

    public static void appendInsertReplaceDelete() {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);       
    }

    public static void insertContent() {
        StringBuffer sb = new StringBuffer("Hello World");

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);        
    }
    public static void replaceContent() {
        StringBuffer sb = new StringBuffer("Hello World");

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
    }
    public static void deleteContent() {
        StringBuffer sb = new StringBuffer("Hello World");

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(0): " + sb);
    }

    public static void reverseContent() {
        StringBuffer sb = new StringBuffer("Hello World");

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }

    public static void modifyContent() {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }

    public static void charAtExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        char ch = sb.charAt(4);
        System.out.println("Character at index 4: " + ch);
    }

    public static void setCharAtExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.setCharAt(6, 'J');
        System.out.println("After setCharAt: " + sb);
    }

    public static void getCharsExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        char[] dest = new char[5];
        sb.getChars(0, 5, dest, 0);
        System.out.println("Extracted chars: " + new String(dest));
    }

    public static void ensureCapacityExample() {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());
    }

    public static void trimToSizeExample() {
        StringBuffer sb = new StringBuffer(100);
        sb.append("Hello World");
        System.out.println("Capacity before trimToSize: " + sb.capacity());
        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());
    }

    public static void indexOfExample() {
        StringBuffer sb = new StringBuffer("Hello World, Welcome to Java World");
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index);
        int lastIndex = sb.lastIndexOf("World");
        System.out.println("Last index of 'World': " + lastIndex);
    }

    public static void lastIndexOfExample() {
        StringBuffer sb = new StringBuffer("Hello World, Welcome to Java World");
        int lastIndex = sb.lastIndexOf("World");
        System.out.println("Last index of 'World': " + lastIndex);
    }

    public static void substringExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        String sub1 = sb.substring(0, 5);
        System.out.println("Substring (0,5): " + sub1);
        String sub2 = sb.substring(6);
        System.out.println("Substring (6): " + sub2);
    }

    public static void subSequenceExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        CharSequence cs = sb.subSequence(0, 5);
        System.out.println("SubSequence (0,5): " + cs);
    }

    public static void toStringExample() {
        StringBuffer sb = new StringBuffer("Hello World");
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
    
    public static void printInfo(StringBuffer sb) {
        System.out.println("Content: '" + sb + "'");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

    public static void main(String[] args) {
        System.out.println("=== Creation and Printing ===");
        creationAndPrinting();
        System.out.println("\n=== Length and Capacity ===");
        lengthAndCapacity();
        System.out.println("\n=== Append, Insert, Replace, Delete ===");
        appendInsertReplaceDelete();
        System.out.println("\n=== Insert Content ===");
        insertContent();
        System.out.println("\n=== Replace Content ===");
        replaceContent();
        System.out.println("\n=== Delete Content ===");
        deleteContent();
        System.out.println("\n=== Reverse Content ===");
        reverseContent();
        System.out.println("\n=== Modify Content ===");
        modifyContent();
    }    
}
