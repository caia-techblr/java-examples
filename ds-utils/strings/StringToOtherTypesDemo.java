public class StringToOtherTypesDemo {
    public static void main(String[] args) {
        String intStr = "123";
        String doubleStr = "45.67";
        String boolStr = "true";

        // Using Integer.parseInt(), Double.parseDouble(), Boolean.parseBoolean()
        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean boolValue = Boolean.parseBoolean(boolStr);

        System.out.println("Using parse methods:");
        System.out.println("String to Integer: " + intValue);
        System.out.println("String to Double: " + doubleValue);
        System.out.println("String to Boolean: " + boolValue);

        // Using wrapper class constructors (deprecated in newer Java versions)
        Integer intObj = new Integer(intStr);
        Double doubleObj = new Double(doubleStr);
        Boolean boolObj = new Boolean(boolStr);

        System.out.println("\nUsing wrapper class constructors:");
        System.out.println("String to Integer: " + intObj);
        System.out.println("String to Double: " + doubleObj);
        System.out.println("String to Boolean: " + boolObj);

        // Using valueOf() methods
        Integer intValOf = Integer.valueOf(intStr);
        Double doubleValOf = Double.valueOf(doubleStr);
        Boolean boolValOf = Boolean.valueOf(boolStr);

        System.out.println("\nUsing valueOf() methods:");
        System.out.println("String to Integer: " + intValOf);
        System.out.println("String to Double: " + doubleValOf);
        System.out.println("String to Boolean: " + boolValOf);
    }
}
