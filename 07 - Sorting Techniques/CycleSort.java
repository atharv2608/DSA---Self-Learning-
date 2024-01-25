import java.util.Arrays;

public class CycleSort {

    static void cycle(int[] array){
        int i = 0;
        while(i < array.length){
            int currentNum = array[i];
            if(currentNum != i+1 && array[i] < array.length){
                int temp = array[currentNum - 1];
                array[currentNum - 1] = currentNum;
                array[i] = temp;
            }
            else
                i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {15,8,1,10,7,12,13,14,6,3,5,9,2,11};
        cycle(array);
        System.out.println(Arrays.toString(array));

    }
}
