public class RichestCustomer {
    static int maximumWealth(int[][] array){
        int richestWealth = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if(sum>richestWealth)
                richestWealth = sum;
        }
        return richestWealth;

    }
    public static void main(String[] args) {
        int[][] array = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        int output = maximumWealth(array);
        System.out.println("Output: "+output);
    }
}
