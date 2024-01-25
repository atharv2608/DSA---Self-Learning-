public class OrderAgnosticBinarySearch {
    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

        boolean isAscending = array[end] > array[start];
        if(array[start] == array[end] && target == array[end]  )
            return 0;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(array[mid] == target)
                return mid;
            if(isAscending){
                if(array[mid] > target)
                    end = mid - 1;
                else if(array[mid] < target)
                    start = mid + 1;
            } else {
                if(array[mid] < target)
                    end = mid - 1;
                else if(array[mid] > target)
                    start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ascendingArray = {12,26,38,41,50,99,103,251,300};
        int target1 = 99;
        int[] descendingArray = {99,45,32,22,19,16,12,2};
        int target2 = 22;
        int[] allEqual = {3,3,3,3,3,3,3,3,3};
        int target3 = 3;

        int index1 = binarySearch(ascendingArray, target1);
        int index2 = binarySearch(descendingArray, target2);
        int index3 = binarySearch(allEqual, target3);

        System.out.println("Index 1: "+index1);
        System.out.println("Index 2: "+index2);
        System.out.println("Index 3: "+index3);
    }
}
