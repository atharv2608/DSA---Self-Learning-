import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber {
    static void swap(int[] array, int first, int last){
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }

    static List<Integer> sort (int[] array){
        int i=0;
        while (i<array.length){
            int currentNum = array[i];
            if(currentNum != i+1 && array[i] != array[array[i]-1]){
                swap(array, i, currentNum-1);
            }
            else
                i++;
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if(array[j] != j+1)
                list.add(j+1);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        sort(array);

    }
}