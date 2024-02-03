import java.util.ArrayList;
import java.util.List;

public class NQueensQuestion {

    static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queen(board, 0);
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        //vertical checking
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }

        //diagonal left check
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //diagonal right check
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

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


    static List<List<String>> queen(boolean[][] board, int row){
        if(row==board.length){
            List<List<String>> solution = new ArrayList<>();
            List<String> sublist = returnList(board);
            solution.add(sublist);
            return solution;
        }

        List<List<String>> solution = new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                solution.addAll(queen(board, row+1));
                board[row][col] = false;
            }
        }
    return solution;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(solveNQueens(n));
    }
}