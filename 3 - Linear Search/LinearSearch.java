public class LinearSearch {

    static int linearSearch(int[] array, int target){
        if(array.length ==0)
            return -1;

        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,458,67869,123,123854};
        int target = 6786;
        System.out.println("Index of "+target+": "+linearSearch(array, target));
    }
}
