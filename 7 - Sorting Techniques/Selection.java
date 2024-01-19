import java.util.Arrays;

public class Selection {
    static int maxIndex(int[] array, int start, int end){
        int max = start;
        for (int i = start+1;  i <= end; i++) {
            if(array[i] > array[max])
                max = i;
        }
        return max;
    }
    static void swap(int[] array, int maxIndex, int lastIndex){
        int temp = array[maxIndex];
        array[maxIndex] = array[lastIndex];
        array[lastIndex] = temp;
    }

    static void selection(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int lastIndex = array.length - i - 1;
            int maxIndex = maxIndex(array, 0, lastIndex);
            swap(array, maxIndex, lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,8,5,11,25,12,21,20,18};
        selection(array);
        System.out.println(Arrays.toString(array));
    }
}
