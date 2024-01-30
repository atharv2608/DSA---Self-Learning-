public class RemoveA {
    static String removeA (StringBuilder answer, String string){
        if(string.isEmpty())
            return answer.toString();
//        if(string.length()==1 && string.charAt(0) == 'a') //--> Similar
//            return answer.toString();
        if(string.charAt(0) != 'a'){
            answer.append(string.charAt(0));
        }

        return removeA(answer, string.substring(1));
    }

    public static void main(String[] args) {
        String s = "aaabdsjkaajkdi";
        System.out.println(removeA(new StringBuilder(""), s));
    }
}
