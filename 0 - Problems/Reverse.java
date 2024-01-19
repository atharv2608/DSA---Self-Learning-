import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int result = 0;
        while (number>0){
            int remainder = number%10;
            result = (result*10)+remainder;
            number = number/10;
        }
        System.out.println("Reversed Number is: "+result);
    }
}
