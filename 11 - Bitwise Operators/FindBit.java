public class FindBit {
    static int returnBit(int number, int bitNumber){
        return (number & 1 << bitNumber -1);
    }


    public static void main(String[] args) {
        System.out.println(returnBit(6, 1));
    }
}
