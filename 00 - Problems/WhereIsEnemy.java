public class WhereIsEnemy {
    static int searchDirection(int[] array, int oneIndex, int direction, int element) {
        int step = (direction == -1) ? -1 : 1;
        for (int i = oneIndex; i >= 0 && i < array.length; i += step) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    static int closest(int[] array){
        int oneIndex = searchDirection(array, 0, 1, 1);
        int left = searchDirection(array, oneIndex, -1, 2);
        int right = searchDirection(array, oneIndex, 1, 2);
        int difference;
        if(right == -1 && left == -1)
            return 0;

        else if(left == -1 && right !=-1)
            difference = right - oneIndex;

        else if(right == -1 && left !=-1)
            difference = oneIndex - left;

        else {
            int rightDiff = right - oneIndex;
            int leftDiff  = oneIndex - left;
            difference = Math.min(rightDiff, leftDiff);
        }

        return difference;
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,0,0,0,0,0,0,0,};
        int closestEnemy = closest(array);
        System.out.println(closestEnemy);

    }
}
