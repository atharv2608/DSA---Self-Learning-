public class CeilingNumber {
    static int ceilingNum(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        if(target > array[end])
            return array.length;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] > target)
                end = mid - 1;
            else if (array[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 10;
        int index = ceilingNum(array, target);
        System.out.println("Index is: "+index);
    }
}
