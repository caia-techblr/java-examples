package ds-utils.strings;

public class ByteBufferDemo {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Convert string to byte array
        byte[] byteArray = str.getBytes();
        System.out.println("Byte Array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        byte byteBuffer[] = new byte[10];
        for (int i = 0; i < 10; i++) {
            byteBuffer[i] = (byte)(64 + i);
            
        }
        System.out.print(byteBuffer);
        // Convert byte array back to string
        String newStr = new String(byteBuffer);
        System.out.println("Converted String: " + newStr);
    }
}
