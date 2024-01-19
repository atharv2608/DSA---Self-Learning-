import java.util.Arrays;

public class Bubble {
    static void bubble(int[] array){
        boolean swap;
        for (int i = 0; i < array.length ; i++) {
            swap = false;
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1]>array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }

    public static void main(String[] args) {
        int[] array = {24, 2 , 12, 8, 36 ,11, 13};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
