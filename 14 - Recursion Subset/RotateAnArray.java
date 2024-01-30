import java.util.ArrayList;
import java.util.Arrays;

public class RotateAnArray {
    static void rotate(int[] array, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : array) {
            arr.add(i);
        }

        for (int i = 0; i <k ; i++) {
            int popped = arr.removeLast();
            arr.add(i, popped);
        }

        int[] newArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArray[i] = arr.get(i);
        }

    }

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 1);
    }
}
