package Sorting;
public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest with current i
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 6};
        selectionSort(data);  // Output: 1 2 5 6 9
    }
}
