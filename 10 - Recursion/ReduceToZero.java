public class ReduceToZero {
    static int numberOfSteps(int num, int count){
        if(num == 0)
            return count;
        count += 1;

        if(num%2==0){
            return numberOfSteps(num/2, count);
        }
        return (numberOfSteps(num-1, count));
    }


    public static void main(String[] args) {
        System.out.println(numberOfSteps(8,0));
    }
}
