import java.util.Arrays;

public class Swapping {
    static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        swap(array, 1,2);
        System.out.println(Arrays.toString(array));
    }
}
