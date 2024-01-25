import java.util.Arrays;

public class InsertionSort {
    static void swap(int[] array, int first, int last){
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5,3,4,1,2 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
