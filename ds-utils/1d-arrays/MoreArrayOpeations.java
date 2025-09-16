//countEvenNumbers, countOddNumbers, differenceBetweenEvenandOddSums, differenceBetweenEvenandOddPositions
public class MoreArrayOpeations {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};

        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Minimum Value: " + ArrayOperations.minValue(arr));
        System.out.println("Maximum Value: " + ArrayOperations.maxValue(arr));
        System.out.println("Sum: " + ArrayOperations.sum(arr));
        System.out.println("Average: " + ArrayOperations.average(arr));

        ArrayOperations.reverse(arr);
        System.out.println("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }   
    public static int countEvenNumbers(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countOddNumbers(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static int differenceBetweenEvenandOddSums(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return evenSum - oddSum;
    }
    public static int differenceBetweenEvenandOddPositions(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int evenPosSum = 0;
        int oddPosSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPosSum += arr[i];
            } else {
                oddPosSum += arr[i];
            }
        }
        return evenPosSum - oddPosSum;
    }
}
