public class TrimOperations {
    public static void main(String[] args) {
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Original String: '" + strWithSpaces + "'");
        System.out.println("Length before trim: " + strWithSpaces.length());

        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
        System.out.println("Length after trim: " + trimmedStr.length());
    }
    public static String leftTrimString(String str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        int st = 0;

        while ((st < len) && (str.charAt(st) <= ' ')) {
            st++;
        }
        return str.substring(st);
        //String leftTrimmed = str.replaceFirst("^\\s+", "");
        //return leftTrimmed;
    }
    public static String rightTrimString(String str) {
        if (str == null) {
            return null;            
        }
        int len = str.length();
        int end = len;      
        while ((end > 0) && (str.charAt(end - 1) <= ' ')) {
            end--;
        }
        return str.substring(0, end);   
        //String rightTrimmed = str.replaceAll("\\s+$", "");
        //return rightTrimmed;
    }        
}
