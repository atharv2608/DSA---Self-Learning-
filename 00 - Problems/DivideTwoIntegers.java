public class DivideTwoIntegers {
    static int divide (int dividend, int divisor){
        int quotient = 0;
        int sum = 0;
        boolean isDividendNegative = dividend < 0;
        boolean isDivisorNegative = divisor < 0;
        if(divisor == 1 || divisor == -1){

            if(divisor*dividend > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return divisor*dividend;
        }

        if(isDividendNegative)
            dividend *= -1;
        if(isDivisorNegative)
            divisor *= -1;
        while (sum+divisor <= dividend){
            sum += divisor;
            quotient++;
        }

        if(isDividendNegative && isDivisorNegative)
            return quotient;
        else if(isDividendNegative)
            return quotient*-1;
        else if (isDivisorNegative) {
            return quotient*-1;
        }

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
        
    }

}
