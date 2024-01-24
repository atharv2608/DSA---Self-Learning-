import java.util.Arrays;

public class BubbleSort {

    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    static void bubble(int[] array, int i){
            for (int j = 1; j < array.length - i ; j++) {
                if(array[j-1] > array[j]){
                    swap(array, j, j-1);
                    bubble(array, i+1);
                }
            }

    }

    public static void main(String[] args) {
        int[] array = {48,26,14,33,20,39,8,17,28};
        bubble(array, 0);
        System.out.println(Arrays.toString(array));
    }
}
