public class BinarySearch {
    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        int comparisons = 0;
        while (start <= end){
            comparisons++;
            int mid = start + (end-start)/2;
            if(array[mid] > target) {
                end = mid - 1;
            }
            else if (array[mid] < target ) {
                start = mid + 1;
            }
            else {
                System.out.println("Comparisons made: " +comparisons);
                return  mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int index = binarySearch(array, 6);
        System.out.println("Element fount at index: "+index);
    }
}
