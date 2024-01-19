public class InfiniteArray {
    static int search(int[] array, int target, int start, int end){
        while (start <= end){
            int mid = start + (end -start)/2;
            if(target > array[mid])
                start = mid + 1;
            else if(target < array[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    static int infiniteArraySearch(int[] array, int target){
        int start = 0;
        int end = 1;

        while (target > array[end]){
            int temp = end + 1;
            end = end + (end - start + 1) *2;
            start = temp;
        }
        return search(array, target, start, end);
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int result = infiniteArraySearch(array, 5);
        System.out.println(result);
    }
}
