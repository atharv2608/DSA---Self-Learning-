public class FindINMountainArray {
    static int searchInMountain(int[] array, int target){
        int peak = peakInMountain(array);
        int index1 = orderAgnosticBS(array, target, 0, peak);
        if(index1 != -1){
            return index1;
        }
        return orderAgnosticBS(array, target, peak+1, array.length-1);
    }

    static int peakInMountain(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(array[mid] > array[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] array, int target, int start , int end){
        boolean isAscending = array[end] > array[start];
        while (start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] == target)
                return mid;
            else if(target > array[mid]){
                if(isAscending){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else if(target < array[mid]){
                if(isAscending)
                    end = end - 1;
                else
                    start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,8,9,7,6,3,0};
        System.out.println(searchInMountain(arr, 7));
    }
}
