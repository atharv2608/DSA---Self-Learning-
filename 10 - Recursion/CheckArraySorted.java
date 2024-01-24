public class CheckArraySorted {
    static boolean isSorted(int[] array, int index){
        if(index == array.length - 1)
            return true;

        return array[index] <= array[index + 1] && isSorted(array, index+1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,6,7};
        System.out.println(isSorted(array, 0));
    }
}
