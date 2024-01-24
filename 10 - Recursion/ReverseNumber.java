public class ReverseNumber {
    static int reversed(int n){
        if(n%10 == n)
            return n;
       int digits = (int) Math.log10(n) + 1;
        return ((n%10)* ((int) Math.pow(10, digits - 1))) + reversed(n/10);
    }

    public static void main(String[] args) {
        System.out.println(reversed(12345));
    }
}
