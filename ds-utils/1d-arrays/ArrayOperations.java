//sum, average, min, max, reverse
public class ArrayOperations {

    public static int minValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int maxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int sum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static void reverse(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        // Creating an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Printing the array
        System.out.print("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Length of the array
        System.out.println("Length of Array: " + numbers.length);

        // Accessing elements
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length - 1]);

        // Modifying elements
        numbers[2] = 99; // Change the third element to 99
        System.out.print("Modified Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
