public class BinarySearch {
    static int search(int[] array, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end-start)/2;
        if(array[mid] == target)
            return mid;
        if(array[mid] > target)
            return search(array, target, start, mid-1);
        return search(array, target, mid+1, end);
    }

    public static void main(String[] args) {
        int[] array = {14, 26, 37, 42, 55, 68, 73, 89, 91, 98};
        int target = 37;
        int index = search(array, target, 0, array.length-1);
        System.out.println(index);
    }
}