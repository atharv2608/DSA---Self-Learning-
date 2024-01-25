public class ThreeDigitArmstrong {
    public static void main(String[] args) {
        for(int i = 100; i<1000; i++){
            int originalNumber  = i;
            int result = 0;
            while (originalNumber > 0){
                int remainder =originalNumber%10;
                result = result + (int) Math.pow(remainder, 3);
                originalNumber =  originalNumber/10;
            }
            if(result == i)
                System.out.println(i);
        }
    }
}
