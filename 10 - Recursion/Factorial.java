public class Factorial {
    static int factorial(int n){
       if(n==2)
           return 2;
       return n * factorial(n-1);

       
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
