package myarray;

public class MyArray {
    private final int maxSize;
    private int[] mArray;
    private int nElements;

    public MyArray(int size) {
        this.maxSize = size;
        this.mArray = new int[maxSize];
        this.nElements = 0;
    }

    public void insertAtEnd(int value) {
        if (nElements >= maxSize) {
            System.out.println("Array is full. Cannot insert " + value);
            return;
        }
        mArray[nElements++] = value;
    }
    public void deleteAtEnd() {
        if (nElements == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }
        nElements--;
    }

    public boolean insertAtMiddle(int value, int index) {
        if (nElements >= maxSize) {
            System.out.println("Array is full. Cannot insert " + value);
            return false;
        }
        if (index < 0 || index > nElements) {
            System.out.println("Invalid index. Cannot insert " + value);
            return false;
        }
        for (int i = nElements; i > index; i--) {
            mArray[i] = mArray[i - 1];
        }
        mArray[index] = value;
        nElements++;
        return true;
    }
    public boolean deleteAtMiddle(int value) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (mArray[i] == value) {
                break;
            }
        }
        if (i == nElements) {
            return false; // Value not found
        }
        for (int j = i; j < nElements - 1; j++) {
            mArray[j] = mArray[j + 1];
        }
        nElements--;
        return true;
    }

    public int find(int value) {
        for (int i = 0; i < nElements; i++) {
            if (mArray[i] == value) {
                return i; // Return index if found
            }
        }
        return -1; // Value not found
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(mArray[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        for (int i = 0; i < nElements - 1; i++) {
            for (int j = 0; j < nElements - 1 - i; j++) {
                if (mArray[j] > mArray[j + 1]) {
                    // Swap
                    int temp = mArray[j];
                    mArray[j] = mArray[j + 1];
                    mArray[j + 1] = temp;
                }
            }
        }
    }

    public int size() {
        return nElements;
    }

    public int capacity() {
        return maxSize;
    }

    public boolean isEmpty() {
        return nElements == 0;
    }

    public boolean isFull() {
        return nElements == maxSize;
    }   
}
