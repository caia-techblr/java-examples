package ds-utils.1darrays;

public class RotateShiftOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Original Array: ");
        printArray(arr);

        shiftLeft(arr,2);
        System.out.println("Array after left shift: ");
        printArray(arr);

        shiftRight(arr,3);
        System.out.println("Array after right shift: ");
        printArray(arr);

        rotateLeft(arr,2);
        System.out.println("Array after left rotation: ");
        printArray(arr);

        rotateRight(arr,3);
        System.out.println("Array after right rotation: ");
        printArray(arr);
    }

    public static void shiftLeft(int[] arr, int npositions) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        npositions = npositions % arr.length;
        if (npositions == 0) return;
        int len = arr.length;
        for (int i = 0; i < len - npositions; i++) {
            arr[i] = arr[i + npositions];
        }
        for (int i = len - npositions; i < len; i++) {
            arr[i] = 0; // Assuming 0 as the default value
        }
    }

    public static void shiftRight(int[] arr, int npositions) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        npositions = npositions % arr.length;
        if (npositions == 0) return;
        int len = arr.length;
        for (int i = len - 1; i >= npositions; i--) {
            arr[i] = arr[i - npositions];
        }
        for (int i = 0; i < npositions; i++) {
            arr[i] = 0; // Assuming 0 as the default value
        }
    }

    public static void rotateLeft(int[] arr, int npositions) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        //TODO: Implement left rotation by npositions
    }

    public static void rotateRight(int[] arr,int npositions) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        //TODO: Implement right rotation by npositions
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
