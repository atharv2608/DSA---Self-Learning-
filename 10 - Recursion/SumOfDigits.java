public class SumOfDigits {

    static int sum(int n){
        String numberString = Integer.toString(n);
        if(numberString.length() == 1)
            return Character.getNumericValue(numberString.charAt(0));


        int firstDigit =  Character.getNumericValue(numberString.charAt(0));
        int restNum = Integer.parseInt(numberString.substring(1));

        return firstDigit + sum(restNum);

    }

    static  int sum2(int n){

        int remainder = n%10;
        int newNumber   = n/10;

        if(n==0)
            return 0;

        return remainder + sum2(newNumber);
    }
    public static void main(String[] args) {
        int n = 1532;
        System.out.println(sum2(n));
    }
}
