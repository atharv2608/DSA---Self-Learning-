import java.util.Arrays;

public class BruteForceQuickSort {

    //Don't do like this. Takes O(n^2) complexity;

    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    static void quickSort(int[] array, int index, int iterator){
        if(index == array.length){
            return;
        }
        int pivot = array.length-index;
        for (int i = 0; i < iterator; i++) {
            if(array[i] > array[pivot])
                swap(array, i, pivot);
        }
        quickSort(array, index+1, iterator-1);

    }

    public static void main(String[] args) {
        int[] array = {8, 12, 5, 3, 10, 1, 6, 14, 4, 15, 11, 7, 2, 9, 13};
        quickSort(array, 1, array.length);
        System.out.println(Arrays.toString(array));
    }
}
