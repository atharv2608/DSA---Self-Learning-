public class Armstrong {
    public static void main(String[] args) {
        int number = 123;
        int originalNumber = number;
        int length = String.valueOf(number).length();
        int result = 0;
        while(number>0){
            int num = number%10;
            result = result + (int) Math.pow(num, length);
            number  = number/10;
        }
        System.out.println(result);
        if(result==originalNumber){
            System.out.println("It is an armstrong number");
        }
        else
            System.out.println("Not an armstrong number");
    }
}
