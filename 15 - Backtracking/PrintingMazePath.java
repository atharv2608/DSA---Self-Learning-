import java.util.ArrayList;

public class PrintingMazePath {
    static void printPath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1)
            printPath(p+'D', r-1, c);
        if(c>1)
            printPath(p+'R', r, c-1);
    }


    static ArrayList returnPrintPath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> path = new ArrayList<>();
            path.add(p);
            return path;
        }
        ArrayList<String> path = new ArrayList<>();
        if(r>1)
            path.addAll(returnPrintPath(p+'D', r-1, c));
        if(c>1)
            path.addAll(returnPrintPath(p+'R', r, c-1));
        return path;
    }

    public static void main(String[] args) {
//        printPath("",3,3);
        ArrayList<String> path = returnPrintPath("", 3,3);
        System.out.println(path);
    }
}
