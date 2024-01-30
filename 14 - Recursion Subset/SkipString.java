public class SkipString {
    static String skipAString(StringBuilder answer, String string){
        if(string.isEmpty())
            return answer.toString();

        if(string.startsWith("apple"))
            return skipAString(answer, string.substring("apple".length()));
        answer.append(string.charAt(0));
        return skipAString(answer, string.substring(1));
    }

    public static void main(String[] args) {
        String s = "orangeapplegrapespineapple";
        System.out.println(skipAString(new StringBuilder(""), s));
    }
}
