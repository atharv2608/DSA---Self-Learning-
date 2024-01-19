import java.util.Arrays;

public class CycleSort {
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void cycle(int[] array){
        int i = 0;
        while (i < array.length){
            int currentNum = array[i];
            if(currentNum != i+1){
                int temp = array[i];
                array[i] = array[currentNum - 1];
                array[currentNum - 1] = temp;
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int[] array={8, 12, 5, 3, 10, 1, 6, 14, 4, 15, 11, 7, 2, 9, 13};
        cycle(array);
        System.out.println(Arrays.toString(array));
    }
}
