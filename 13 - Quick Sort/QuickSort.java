import java.util.Arrays;

public class QuickSort {
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void sort(int[] array, int low, int high){
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = array[mid];

        while (start <= end){
            while (array[start] < pivot)
                start++;
            while (array[end] > pivot)
                end--;

            if(start <= end){
                swap(array, start, end);
                start++;
                end--;
            }

            sort(array, low, end);
            sort(array, start, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 12, 5, 3, 10, 1, 6, 14, 4, 15, 11, 7, 2, 9, 13};
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }
}
