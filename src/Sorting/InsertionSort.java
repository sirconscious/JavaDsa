package Sorting;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;

            // Shift elements to the right until the correct position is found
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            // Insert temp at the correct position
            arr[j] = temp;
        }

        // Print the sorted array
        for (int d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 5, 4};
        new InsertionSort().sort(arr);
    }
}
