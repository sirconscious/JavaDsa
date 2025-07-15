package Search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return the index of the found element
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 7, 5, 8};
        int target = 7;

        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
