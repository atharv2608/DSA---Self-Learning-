public class CeilingChar {

    static char ceilingChar(char[] array, char target){
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return array[start %array.length];
    }

    public static void main(String[] args) {
        char[] array = {'c', 'f', 'j'};
        char target = 'd';
        System.out.println("Character is: "+ceilingChar(array, target));
    }
}
