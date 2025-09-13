public class CaseOperations {

    public static boolean isUpperCase(String str) {
        /*for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;*/
        return str.equals(str.toUpperCase());
    }
    public static boolean isLowerCase(String str) {
        /*for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;*/
        return str.equals(str.toLowerCase());
    }

    public static String capitalize(String sentence) {
       // Capitalize first letter of each word (using split and loop)
        String[] words = sentence.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }
        //System.out.println("Capitalized: " + capitalized.toString().trim());
        return capitalized.toString().trim();
    }   
    public static void main(String[] args) {
        String original = "Hello, World! Welcome to Java Programming.";

        // Convert to uppercase
        String upperCase = original.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert to lowercase
        String lowerCase = original.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Check if a string is in uppercase
        String str = "Hello World";
        String ustr = "ABCDXYZ"; 
        String lstr = "abcdxyz"; 

        System.out.println(" Is str in uppercase? " + isUpperCase(str));
        System.out.println(" Is ustr in uppercase? " + isUpperCase(ustr));

        System.out.println(" Is str in lowercase? " + isLowerCase(str));
        System.out.println(" Is lstr in lowercase? " + isLowerCase(lstr));   
        
        String sentence = "hello world! this is java.";
        String capitalizedSentence = capitalize(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
    }
}
