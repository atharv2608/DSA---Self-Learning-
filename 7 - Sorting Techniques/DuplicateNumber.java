import java.util.Arrays;

public class DuplicateNumber{
    static void swap(int[] array, int first, int last){
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }

    static int duplicate(int[] array){
        int i=0;
        while (i<array.length){
            int currentNum = array[i];
            if(currentNum != i+1 && array[i] != array[array[i]-1]){
                swap(array, i, currentNum-1);
            }
            else
                i++;
        }

        for (int j = 0; j < array.length; j++) {
            if(array[j] != j+1)
                return array[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,2};
        System.out.println(duplicate(array));
//        System.out.println(Arrays.toString(array));
    }
}
