package backtracking;
import java.util.*;

public class Maze {

    static int noOfWays(int rows, int cols){
        if( rows == 1 || cols == 1){
            return 1;
        }
        int left = noOfWays(rows-1, cols);
        int right = noOfWays(rows, cols-1);
        return left + right;
    }

    static ArrayList<String> arrlist = new ArrayList<>();
    static void path(String p, int rows, int cols){
        if(rows == 1 && cols == 1){
            arrlist.add(p);
            return;
        }
        if(rows > 1){
            path(p+"D", rows - 1, cols);        // "D" means DOWN
        }
        if(cols > 1){
            path(p+"R", rows, cols - 1);        // "R" means RIGHT
        } 
    }

    static ArrayList<String> arrlist2 = new ArrayList<>();
    static void pathDiagonal(String p, int rows, int cols) {
        if(rows == 1 && cols == 1){
            arrlist2.add(p);
            return;
        }
        if(rows > 1 && cols > 1){
            pathDiagonal(p+"D", rows - 1, cols - 1);          // "D" means DIAGONAL
        }
        if(rows > 1){
            pathDiagonal(p+"V", rows - 1, cols);             // "V" means VERTICAL
        }
        if(cols > 1){
            pathDiagonal(p+"H", rows, cols - 1);            // "H" means HORIZONTAL
        }
    }
    public static void main(String[] args) {
        int ans1 = noOfWays(3, 3);
        System.out.println(ans1);
        path("", 3, 3);
        System.out.println(arrlist);
        pathDiagonal("", 3, 3);
        System.out.println(arrlist2);
    }
}
