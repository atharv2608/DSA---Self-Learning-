public class Methods {
    static void changeValue(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
//        int[] array = {1,2,3,4};
//        changeValue(array);
//        System.out.println(array[0]);
        String name = "atharv";
        String anotherName = name;
        name = "Kalyani";
        System.out.println(name);
        System.out.println(anotherName);
    }
}