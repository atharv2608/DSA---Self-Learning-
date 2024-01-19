import java.util.ArrayList;
import java.util.Scanner;

public class MonthlySalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        ArrayList<Float> noOfPieces = new ArrayList<>();
        ArrayList<Float> rateArray = new ArrayList<>();
        ArrayList<Float> total = new ArrayList<>();
        while(true){
            System.out.print("Enter the number of pieces: ");
            float pieces = scan.nextInt();
            if(pieces==0)
                break;
            else {
                System.out.print("Enter the rate: ");
                float rate = scan.nextFloat();
                float currentRate = (pieces/12) * rate;
                sum += currentRate;
                noOfPieces.add(pieces);
                rateArray.add(rate);
                total.add(currentRate);
            }
        }
        System.out.println("Sr      Pieces      Rate        Total");
        for (int i = 0; i < noOfPieces.toArray().length; i++) {
            System.out.println(i+1 +"       "+noOfPieces.get(i)+"       "+rateArray.get(i)+"        "+total.get(i));
        }


        System.out.println("Grand Total: "+sum);
    }
}
