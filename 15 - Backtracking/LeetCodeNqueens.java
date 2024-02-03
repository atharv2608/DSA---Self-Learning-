// Output = [["Q...", "..Q."],[same]]

import java.util.ArrayList;
import java.util.List;

public class LeetCodeNqueens {


    static List<String> returnList(boolean[][] board){
        List<String> list = new ArrayList<>();
        for(boolean[] row: board){
            StringBuilder sb = new StringBuilder();
            for(boolean element: row){
                if(element)
                    sb.append("Q");
                else
                    sb.append(".");
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        boolean[][] board = {
                {false, true, false, false},
                {false, false, false, true},
                {true, false, false, false},
                {false, false, true, false}
        };

    }
}