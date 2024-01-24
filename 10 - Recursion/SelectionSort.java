import java.util.Arrays;

public class SelectionSort {
    static int maxElement (int[] array, int end){
        int max = 0;
        for (int i = 0; i < end; i++) {
            if(array[i] > array[max])
                max = i;
        }
        return max;
    }

    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    static void selection(int[] array, int i){
        if(i==array.length)
            return;
        int lastIndex = array.length - i -1;
        int max = maxElement(array, lastIndex);
        swap(array, max, lastIndex);
        selection(array, i+1);
    }

    public static void main(String[] args) {
        int[] array = {48,26,14,33,20,39,8,17,28};
//        System.out.println(maxElement(array, array.length));
        selection(array, 0);
        System.out.println(Arrays.toString(array));
    }
}
