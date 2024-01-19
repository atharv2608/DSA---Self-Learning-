public class PeakInMountainArray {
    static int peak(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(array[mid] > array[mid+1])
                end =  mid;
            else if(array[mid] < array[mid+1])
                start = mid+1;
        }
        return  start;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,7,8,10,11,12,25,20,21,15,12,10,9,5,3,1};
        int ans = peak(array);
        System.out.println("Peak element: "+array[ans]);
    }
}
