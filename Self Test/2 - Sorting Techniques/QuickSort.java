import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
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
            if(array[start] < pivot)
                start++;
            if(array[end]>pivot)
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
        int[] array = {5,21,4,89,63,10,1,57};
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
