public class Reverse {
    static int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative)
            x = x * -1;
        int reverse = 0;
        while(x>0){
            int remainder = x%10;
            if((long)reverse*10 > Integer.MAX_VALUE)
                return 0;
            reverse = (reverse*10)+remainder;
            x = x/10;
        }

        if(isNegative)
            return reverse * -1;
        return reverse;
    }

    public static void main(String[] args) {
        int num = 1534236469;
        int reverse = reverse(num);
        System.out.println(reverse);
    }
}