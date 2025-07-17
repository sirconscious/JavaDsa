package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 7, 3, 4, 6, 2};
        quickSort(arr, 0, arr.length - 1);

        for (int d : arr) {
            System.out.print(d + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // partition index

            quickSort(arr, low, pi - 1);  // sort left part
            quickSort(arr, pi + 1, high); // sort right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // pivot
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
