public class ArrangingCoins {
    static int arrangeCoins(int n) {
        if(n == 1 || n == 2)
            return 1;
        int start = 1;
        int end = 1;
        int count = 0;
        while (end <= n){
            count += 1;
            int diff = end - start ;
            start = start + diff + 1;
            end = end + diff + 2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(15));
    }
}
