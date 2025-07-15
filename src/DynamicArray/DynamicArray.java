package DynamicArray;

public class DynamicArray {
    private int[] arr;
    private int size;      // Number of elements
    private int capacity;  // Actual array length

    public DynamicArray() {
        arr = new int[2];  // Start small
        size = 0;
        capacity = 2;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();  // double the capacity
        }
        arr[size++] = value;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void removeLast() {
        if (size > 0) size--;
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
