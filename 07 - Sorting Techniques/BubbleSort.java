import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array){
        boolean swapped;
        for(int i=0; i<array.length; i++){
            swapped = false;
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }

    }

    public static void main(String[] args) {
        int[] array = {24, 2 , 12, 8, 36 ,11, 13};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
