public class Prime {
    static boolean isPrime(int number){
        if(number <=1)
            return false;
        int c = 2;
        while (c*c<=number){
            if(number%c==0){
                return false;
            }
            else
                c++;
        }
        return c * c > number;
    }

    public static void main(String[] args) {
        boolean result = isPrime(36);
        System.out.println(result);
    }
}
