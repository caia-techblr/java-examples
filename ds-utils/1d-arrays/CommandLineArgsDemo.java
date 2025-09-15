public class CommandLineArgsDemo {
    public static void main(String[] args) {
        // Check if any command line arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return;
        }

        // Print each command line argument
        System.out.println("Command Line Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }

        // Print the total number of arguments
        System.out.println("Total number of arguments: " + args.length);

        //Sum of command line arguments if they are integers
        int sum = 0;
        for (String arg : args) {
           sum += Integer.parseInt(arg);                
        }       
        System.out.println("Sum of integer arguments: " + sum);
        //TODO: Handle exceptions for non-integer inputs
    }
}
