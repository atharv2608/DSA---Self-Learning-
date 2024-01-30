public class IndexOfFirstOccurrence {
    static int first(String haystack, String needle){
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.substring(i).startsWith(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "ssdbutsad";
        String needle = "sad";
        System.out.println(first(haystack, needle));
    }
}
