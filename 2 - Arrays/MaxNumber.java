public class MaxNumber {
    static int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,10,3,4,5};
        System.out.println(max(array));
    }
}
