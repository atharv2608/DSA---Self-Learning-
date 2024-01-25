import java.util.ArrayList;

public class ArrayListTut {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
//        System.out.println(numbers);

//        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.toArray().length);

    }

}
