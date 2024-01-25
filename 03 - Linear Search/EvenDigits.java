public class EvenDigits {
    static int evenDigit(int[] nums){
        int totalCount = 0;
        for(int element: nums){
            int count = 0;
            while (element>0){
                count++;
                element = element/10;
            }
            if(count%2==0)
                totalCount++;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int[] array = {12,12,12,12,12,12,12};
        int result = evenDigit(array);
        System.out.println("Total count of numbers with even digits: "+result);
    }
}
