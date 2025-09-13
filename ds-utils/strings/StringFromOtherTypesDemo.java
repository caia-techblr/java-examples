public class StringFromOtherTypesDemo {
    public static void main(String[] args) {
        int num = 123;
        double decimalNum = 45.67;
        boolean bool = true;

        // Using String.valueOf()
        String str1 = String.valueOf(num);
        String str2 = String.valueOf(decimalNum);
        String str3 = String.valueOf(bool);

        System.out.println("Using String.valueOf():");
        System.out.println("Integer to String: " + str1);
        System.out.println("Double to String: " + str2);
        System.out.println("Boolean to String: " + str3);

        // Using Integer.toString(), Double.toString(), Boolean.toString()
        String str4 = Integer.toString(num);
        String str5 = Double.toString(decimalNum);
        String str6 = Boolean.toString(bool);

        System.out.println("\nUsing toString() methods:");
        System.out.println("Integer to String: " + str4);
        System.out.println("Double to String: " + str5);
        System.out.println("Boolean to String: " + str6);

        // Using concatenation
        String str7 = num + "";
        String str8 = decimalNum + "";
        String str9 = bool + "";

        System.out.println("\nUsing concatenation:");
        System.out.println("Integer to String: " + str7);
        System.out.println("Double to String: " + str8);
        System.out.println("Boolean to String: " + str9);

        Point p1 = new Point(10, 20);
        String pointStr = p1.toString();
        System.out.println("\nPoint object to String: " + pointStr);
    }
}
