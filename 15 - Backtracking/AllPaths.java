public class AllPaths {
    static void printPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        maze[r][c] = false;
        if(r<maze.length-1)
            printPaths(p+'D', maze, r+1, c);
        if(c<maze[0].length - 1)
            printPaths(p+'R', maze, r, c+1);
        if(c>0)
            printPaths(p+'L', maze, r, c-1);
        if(r>0)
            printPaths(p+'U', maze, r-1, c);

        maze[r][c] = true;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        printPaths("", maze, 0,0 );
    }
}