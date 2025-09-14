public class IrregularArrayDemo {
    public static void main(String[] args) {
        // Create an irregular (jagged) array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[4]; // First row has 4 columns
        jaggedArray[1] = new int[6]; // Second row has 6 columns
        jaggedArray[2] = new int[5]; // Third row has 5 columns
        
        // Initialize the jagged array with some values
        int value = 1;
        for(int i=0; i<jaggedArray.length; i++) {
            for(int j=0; j<jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }
        
        // Print the jagged array
        System.out.println("Jagged Array:");
        for(int i=0; i<jaggedArray.length; i++) {
            for(int j=0; j<jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
