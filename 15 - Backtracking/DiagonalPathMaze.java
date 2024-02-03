public class DiagonalPathMaze {
    static int count(int r, int c){
        if(r==1 || c==1)
            return 1;
        int down = count(r-1, c);
        int right = count(r, c-1);
        int diagonal = count(r-1, c-1);

        return down+right+diagonal;
    }

    static void printPaths(String p, int r, int c){
        if(r==1 && c ==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            printPaths(p+'D', r-1, c);
        if(c>1)
            printPaths(p+'R', r, c-1);
        if(r>1 && c>1)
            printPaths(p+'C', r-1, c-1);
    }
    public static void main(String[] args) {
//        System.out.println(count(3,3));
        printPaths("", 3, 3);
    }

}
