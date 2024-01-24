public class FindUnique {
    static int unique(int[] array){
        int result = 0;
        for(int n:array){
            result ^= n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,4,5,5};
        System.out.println(unique(array));
    }
}
