public class PalindromeString {
    public static void main(String[] args) {
        String string = "abcdeba";
        int start = 0;
        int end = string.length()-1;
        boolean result = true;
        while (end>start){
            if(string.charAt(start) != string.charAt(end))
                result = false;
            start++;
            end--;
        }
        if(result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
