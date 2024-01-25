import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        while (true){
            System.out.print("Enter Rate: ");
            float rate = scan.nextFloat();
            if(rate == 0)
                break;
            else {
                System.out.print("Enter number of pieces: ");
                float pieces = scan.nextFloat();
                sum  += (pieces /12) * rate;
            }
        }
        System.out.println("Grand total is: "+sum);
    }
}
