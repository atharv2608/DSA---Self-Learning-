import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    static int maxLength(List<String> arr){
        if(arr.size() == 1)
            return arr.get(0).length();

        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i).length() + arr.get(j).length() > max)
                    max = arr.get(i).length() + arr.get(j).length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("un","iq","ue");
        System.out.println(maxLength(arr));
    }
}
