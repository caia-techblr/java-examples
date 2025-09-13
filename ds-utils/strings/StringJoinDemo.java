public class StringJoinDemo {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "from", "Java"};
        String joinedString = String.join(" ", words);
        System.out.println("Joined String: " + joinedString);

        String csv = String.join(",", "apple", "banana", "cherry");
        System.out.println("CSV String: " + csv);

        String path = String.join("/", "home", "user", "documents");
        System.out.println("File Path: " + path);

        String timeString = String.join(":", "12", "30", "45");
        System.out.println("Time String: " + timeString);  
        
        String dateString = String.join("-", "2024", "06", "15");
        System.out.println("Date String: " + dateString);

        //String ipAddress = String.join(".", "192", "168", "1", "1");
        //System.out.println("IP Address: " + ipAddress);

        int octes[] = {192, 168, 1, 1};
        String ipAddress = String.join(".",
            String.valueOf(octes[0]),
            String.valueOf(octes[1]),
            String.valueOf(octes[2]),
            String.valueOf(octes[3])
        );
        System.out.println("IP Address: " + ipAddress);

        String[] octetStrings = java.util.Arrays.stream(octes)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        String ipFromOctets = String.join(".", octetStrings);
        System.out.println("IP Address from octets: " + ipFromOctets);        
    }
}
