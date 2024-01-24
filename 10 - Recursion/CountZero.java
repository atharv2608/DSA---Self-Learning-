public class CountZero {
    static int countZero(int n, int count){
        if(n%10==n)
            return count;
        if(n%10==0){
            count++;
            return countZero(n/10, count);
        }
        return countZero(n/10, count);
    }

    public static void main(String[] args) {

        System.out.println(countZero(123, 0));
    }
}
