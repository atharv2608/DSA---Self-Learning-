public class Maze {

    static int count(int r, int c){
        if(r==1 || c ==1)
            return 1;
        int down = count(r-1, c);
        int right = count(r, c-1);
        return down + right;
    }

    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
}
