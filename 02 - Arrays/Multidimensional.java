
import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numbers = new int[3][4];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print("Enter value of "+ i+ "" +j+": " );
                numbers[i][j] = scan.nextInt();
            }
        }
    }
}
