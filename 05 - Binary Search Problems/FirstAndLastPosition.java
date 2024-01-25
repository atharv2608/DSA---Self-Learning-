import java.util.Arrays;

public class FirstAndLastPosition {
    static int[] firstAndLastPosition(int[] array, int target){
        int[] ans = {-1,-1};
        ans[0] = search(array, target, true);
        if(ans[0] != -1){
            ans[1] = search(array, target, false);
        }
        return ans;
    }
    static int search(int[] array, int target, boolean searchFirst){
        int ans = -1;
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > array[mid])
                start = mid + 1;
            else if (target < array[mid])
                end = mid - 1;
            else{
                ans = mid;
                if(searchFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        int target = 8;
        int[] result = firstAndLastPosition(array, target);
        System.out.println(Arrays.toString(result));
    }
}
