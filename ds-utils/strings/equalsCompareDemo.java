public class equalsCompareDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "World";

        // Using equals() method
        System.out.println("Using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        //equalsIgnoreCase() method
        String strA = "hello";
        String strB = "HELLO";
        System.out.println("\nUsing equalsIgnoreCase() method:");
        System.out.println("strA.equalsIgnoreCase(strB): " + strA.equalsIgnoreCase(strB)); // true

        // Using == operator
        System.out.println("\nUsing == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == str3: " + (str1 == str3)); // true
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        // Summary
        System.out.println("\nSummary:");
        System.out.println("equals() checks for value equality.");
        System.out.println("== checks for reference equality.");

        // compareTo() method
        String str5 = "abcdxyz";
        String str6 = "abcdxyz";
        String str7 = "abcd";
        String str8 = "abxyz";
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str5.compareTo(str6): " + str5.compareTo(str6)); // 0
        System.out.println("str5.compareTo(str6): " + str5.compareTo(str7)); // positive value
        System.out.println("str5.compareTo(str8): " + str5.compareTo(str8)); // negative value    
        
        //compareToIgnoreCase() method
        String strC = "abcdxyz";
        String strD = "ABCDXYZ";
        System.out.println("\nUsing compareToIgnoreCase() method:");        

        //startsWith() and endsWith()
        String str9 = "Hello, World!";
        System.out.println("\nUsing startsWith() and endsWith() methods:");
        System.out.println("str9.startsWith(\"Hello\"): " + str9.startsWith("Hello")); // true
        System.out.println("str9.endsWith(\"World!\"): " + str9.endsWith("World!")); // true    
        
        //contentEquals() method
        String str10 = "Hello";
        StringBuffer strBuffer = new StringBuffer("Hello");
        System.out.println("\nUsing contentEquals() method:");
        System.out.println("str10.contentEquals(strBuffer): " + str10.contentEquals(strBuffer)); // true

        //regionMatches() method
        String str11 = "Hello, World!";
        String str12 = "Hello, Java!";
        System.out.println("\nUsing regionMatches() method:");
        System.out.println("str11.regionMatches(7, str12, 7, 4): " + str11.regionMatches(7, str12, 7, 4)); // true
    }
}
