package ds-utils.strings;

public class StringSplitDemo {
    public static void main(String[] args) {
        String str = "apple,banana,cherry,date";
        String[] fruits = str.split(",");

        System.out.println("Original String: " + str);
        System.out.println("Splitted Strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String timeStr = "12:30:45";
        String[] timeParts = timeStr.split(":");
        System.out.println("\nTime String: " + timeStr);
        System.out.println("Hour: " + timeParts[0]);
        System.out.println("Minute: " + timeParts[1]);
        System.out.println("Second: " + timeParts[2]);

        String dateStr = "2024-06-15";
        String[] dateParts = dateStr.split("-");
        System.out.println("\nDate String: " + dateStr);    
        System.out.println("Year: " + dateParts[0]);
        System.out.println("Month: " + dateParts[1]);
        System.out.println("Day: " + dateParts[2]);

        String ipstr = "192.168.72.25";
        String[] ipParts = ipstr.split("\\.");
        System.out.println("\nIP Address: " + ipstr);           
        System.out.println("Octet 1: " + ipParts[0]);
        System.out.println("Octet 2: " + ipParts[1]);
        System.out.println("Octet 3: " + ipParts[2]);
        System.out.println("Octet 4: " + ipParts[3]);

        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.println("\nSentence: " + sentence);           
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);       
        }
    }
}
