public class CeilingNumber {
    static int ceilingNum(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(array[mid] > target)
                end = mid - 1;
            else if(array[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,10,13,17,18};
        int target = 16;
        int ans = ceilingNum(array, target);
        System.out.println("Index is: "+ans);
        System.out.println("Number is: "+array[ans]);
    }
}
