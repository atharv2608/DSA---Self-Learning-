import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int p  = 0;
        int i = 1;
        int sum = 0;
        int count = 2;
        while(count <= number){
            sum = p+i;
            p=i;
            i = sum;
            count++;
        }
        System.out.println(i);
    }
}
