import java.util.Arrays;

public class BinarySearchIn2DArray {
    static int[] search(int[][] array, int target){
        int r = 0;
        int c = array[0].length - 1;

        while(r < array.length && c >= 0){
            if(array[r][c] == target)
                return new int[]{r,c};
            else if(array[r][c] > target)
                c--;
            else
                r++;
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {5,8,10,14},
                {9,11,12,16},
                {13,15,18,24},
                {17,23,26,28}
        };
        System.out.println(Arrays.toString(search(matrix, 18)));
    }
}