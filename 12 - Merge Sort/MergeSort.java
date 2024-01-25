import java.util.Arrays;

public class MergeSort {

    static int[] sort (int[] array){
        if(array.length == 1){
            return array;
        }

        int mid = array.length/2;

        int[] left = sort(Arrays.copyOfRange(array, 0, mid));
        int[] right = sort(Arrays.copyOfRange(array, mid, array.length));

        return merged(left, right);
    }

    static int[] merged(int[] left, int[] right){
        int[] mergedArray = new int[left.length + right.length];
        int i=0;
        int j=0 ;
        int k=0;
        while (i<left.length && j<right.length){
            if(left[i] < right[j]){
                mergedArray[k] = left[i];
                i++;
            }
            else{
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            mergedArray[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            mergedArray[k] = right[j];
            k++;
            j++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array = {5,2,1,4,3,6};
        int[] sorted = sort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
