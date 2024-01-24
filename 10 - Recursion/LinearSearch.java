public class LinearSearch {

    static int findElement(int[] array, int target, int index){
        if(index == array.length)
            return -1;
        if(array[index] == target)
            return index;
        return findElement(array, target, index+1);
    }

    public static void main(String[] args) {
        int[] array = {14, 26, 37, 42, 55, 68, 73, 89, 91, 98};
        int target = 68;
        System.out.println(findElement(array, target, 0));
    }
}
