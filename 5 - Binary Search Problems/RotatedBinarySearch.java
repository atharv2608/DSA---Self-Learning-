public class RotatedBinarySearch {

    static  int pivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(array[mid] > array[mid+1]){

            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = {12,1,2,3,4,5,6};
        int pivot = pivot(array);
        System.out.println(array[pivot]);
    }
}
