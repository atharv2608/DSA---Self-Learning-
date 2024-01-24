import java.util.Scanner;

public class OddEven {
    static boolean isOdd(int number){
        return (number & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        boolean result = isOdd(num);
        if(result)
            System.out.println("Odd number");
        else
            System.out.println("Even Number");
    }
}
