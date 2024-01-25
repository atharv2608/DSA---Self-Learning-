import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    static int[] twoSum(Integer[] numArray, int target){
        int[] indices = {-1,-1};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numArray));
        for (int i = 0; i <numbers.toArray().length ; i++) {
            int difference = target - numbers.get(i);
            if(difference == numbers.get(i)){
                if(i == numbers.lastIndexOf(difference))
                    continue;
                else{
                    indices[0] = i;
                    indices[1] = numbers.lastIndexOf(difference);
                    break;
                }
            }
            if(numbers.contains(difference)){
                indices[0] = i;
                indices[1] = numbers.indexOf(difference);
                break;
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        Integer[] numArray = {3,3};
        int target = 6;
        int[] result = twoSum(numArray, target);
        System.out.println(Arrays.toString(result));
    }
}
