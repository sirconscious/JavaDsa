package Search;

public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // Avoid divide-by-zero
            if (arr[high] == arr[low]) {
                if (arr[low] == target) return low;
                else return -1;
            }

            // Estimate the position
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == target)
                return pos;
            else if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int index = interpolationSearch(arr, target);
        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found");
    }
}
