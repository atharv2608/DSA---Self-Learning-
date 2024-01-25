import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        while (true){
            System.out.print("Enter Number of pieces: ");
            float pieces = scan.nextFloat();
            if(pieces == 0)
                break;
            else {
                System.out.print("Enter the rate: ");
                float rate = scan.nextFloat();
                sum += (pieces/12) * rate;
            }
        }
        System.out.println("Grand Total: Rs. "+sum);
    }
}
