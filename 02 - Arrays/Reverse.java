import java.util.Arrays;
public class Reverse {
    static void reverse(int[] array){
        int startPoint = 0;
        int endPoint = array.length -1;
        while(endPoint > startPoint){
            int temp = array[startPoint];
            array[startPoint] = array[endPoint];
            array[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Before reversing: "+Arrays.toString(array));
        reverse(array);
        System.out.println("After reversing: "+Arrays.toString(array));
    }
}