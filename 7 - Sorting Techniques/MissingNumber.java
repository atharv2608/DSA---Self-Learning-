public class MissingNumber {
    static int missing(int[] array){
        int i = 0;
        while(i<array.length){
            int currentNum = array[i];
            if(currentNum < array.length && currentNum != i){
                int temp = array[i];
                array[i] = array[currentNum];
                array[currentNum] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if(array[j] != j)
                return j;

        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,4,1};
        System.out.println(missing(arr));
    }
}