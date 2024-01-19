public class InfiniteArray{
    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static int searchInfiniteArray(int[] arr, int target) {
        int low = 0;
        int high = 1;

        // Double the high index until the element at high is greater than the target
        while (arr[high] < target) {
            low = high;
            high *= 2;
        }

        // Perform binary search within the range [low, high]
        return binarySearch(arr, low, high, target);
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 0,1,3,5,11,12,14,18,20,24}; // Sample infinite array
        int target = 24;
        int index = searchInfiniteArray(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
