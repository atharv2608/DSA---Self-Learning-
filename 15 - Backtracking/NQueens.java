public class NQueens {
    static void display(boolean[][] board){
        for(boolean[] rows: board){
            for(boolean element: rows){
                if(element)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // Vertical checking
        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }

        //Diagonal left checking
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //Diagonal right checking
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

    static int queens(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
}