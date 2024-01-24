public class RotatedBinarySearch {

    static int pivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && array[mid] > array[mid+1])
                return mid;
            if(mid > 0 && array[mid-1] > array[mid])
                return mid -1;
            if(array[start] > array[mid])
                end = mid -1;
            if(array[start] < array[mid])
                start = mid;
        }
        return -1;
    }

    static int binarySearch(int[] array, int target, int start, int end){
        while (start <= end){
            int mid = start+(end-start)/2;
            if(array[mid] >  target)
                end = mid - 1;
            else if(array[mid] < target)
                start = mid + 1;
            else return mid;
        }
        return -1;
    }

    static int rotatedSearch(int[] array,int target){
        int pivot = pivot(array);
        if(array[pivot] == target)
            return pivot;
        int index = binarySearch(array, target, 0 , pivot-1);
        if(index != -1)
            return index;
        return binarySearch(array, target, pivot+1, array.length -1);
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,6,1,2};
        System.out.println(rotatedSearch(array, 2));
    }
}