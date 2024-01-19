public class Shadowing {
    public static void main(String[] args) {
        int x = 500;
        {
            System.out.println(x);

            System.out.println(x);

        }
    }
}
