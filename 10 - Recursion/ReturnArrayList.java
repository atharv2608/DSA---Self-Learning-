import java.util.ArrayList;
import java.util.List;

public class ReturnArrayList {
    static List<Integer> returnList(int[] array, int target, int index, List<Integer> list){
        if(index == array.length)
            return list;
        if(array[index] == target)
            list.add(index);
        return returnList(array, target, index+1, list);
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,4,5,6,7};
        int target = 4;
        List<Integer> list = new ArrayList<>();
        System.out.println(returnList(array, target, 0, list));
    }
}
