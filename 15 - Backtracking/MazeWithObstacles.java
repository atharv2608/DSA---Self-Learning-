public class MazeWithObstacles {
    static void printPath(String p, int r, int c, int[] obstacle){
        if(r== obstacle[0] && c == obstacle[1])
            return;
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            printPath(p+'D', r-1, c, obstacle);
        if(c>1)
            printPath(p+'R', r, c-1, obstacle);
    }

    public static void main(String[] args) {
        printPath("", 3,3,new int[]{2,3});
    }
}
