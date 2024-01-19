import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("Enter number to be counted: ");
        int target = scan.nextInt();
        int count = 0;
        while (number>0){
            int remainder = number%10;
            if(remainder == target)
                count++;
            number = number /10;
        }

        System.out.println("Count is: "+ count);
    }
}
