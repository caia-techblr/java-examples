public class TwoDArrayDemo {
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }   
    public static void fillRandomValues(int[][] array,int ulimit) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * ulimit); // Randomly assign value in the range 0-99  
            }
            System.out.println();
        }
    }   
    public static void initialized2DArray() {
        int[][] matrix = {
            {11, 22, 33},
            {44, 55, 66},
            {77, 88, 99}
        };

        // Printing the 2D array
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //print2DArray(matrix);
        
        // Accessing elements
        System.out.println("Element at (1,1): " + matrix[1][1]); // Should print 5

        // Length of the 2D array
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in first row: " + matrix[0].length);
        }
    }
    public static void uninitializedArray() {
        // Creating a 2D array without initialization, and fill random values
        int numRows = 3;
        int numCols = 4;
        int[][] anotherMatrix = new int[numRows][numCols];
        for (int i = 0; i < anotherMatrix.length; i++) {
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                anotherMatrix[i][j] = (int)(Math.random() * 100); // Randomly assign value in the range 0-99            }
            System.out.println();
        }
        //fillRandomValues(anotherMatrix,100);
        System.out.println("Another 2D Array (Matrix) with random values:");
        print2DArray(anotherMatrix);
    }
}
