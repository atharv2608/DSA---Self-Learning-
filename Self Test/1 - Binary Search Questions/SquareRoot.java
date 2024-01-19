public class SquareRoot {
    static int sqrt(int x){
        if(x == 0 || x == 1)
            return (x == 0) ? 0 : 1;
        int start = 1;
        int end = x;
        while (start < end){
            int mid = start + (end - start)/2;
            if(mid*mid == x)
                return mid;
            else if(mid*mid > x)
                start = mid + 1;
            else if(mid*mid < x)
                end = mid - 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int result = sqrt(2);
        System.out.println(result);
    }
}
