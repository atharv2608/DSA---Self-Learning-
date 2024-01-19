import java.util.Arrays;

public  class Solution {
    public static boolean doesExist(int[] array, int element, int startPoint){
        boolean doesExist = false;
        for (int i=startPoint; i<array.length; i++)
            if (array[i] == element) {
                doesExist = true;
                break;
            }
        return  doesExist;
    }
    public static int indexOf(int[] array, int element, int startPoint){
        int index = -1;
        for(int j=startPoint; j<array.length; j++){
            if(array[j] == element){
                index = j;
                break;
            }
        }
        return index;
    }
    public int[] twoSum(int[] nums, int target){
        int firstIndex = -1;
        int secondIndex = -1;

        for(int k=0; k<nums.length; k++){
            int difference = target - nums[k];

            if(difference == nums[k]){
                if(doesExist(nums, difference, k+1)){
                    firstIndex = indexOf(nums, nums[k], 0);
                    secondIndex = indexOf(nums, difference, k+1);
                    break;
                }
            }

            else if(difference != nums[k]){
                if(doesExist(nums, difference, 0)){
                        firstIndex = indexOf(nums, nums[k], 0);
                        secondIndex = indexOf(nums, difference, 0);
                        break;
                }
            }
        }
        return new int[] {firstIndex, secondIndex} ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {3,2,4};
        int target = 7;
        int[] output = solution.twoSum(array, target);
        if(output[0]==-1 && output[1]==-1)
            System.out.println("No Such Numbers");
        else
            System.out.println(Arrays.toString(output));
    }
}