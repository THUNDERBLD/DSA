package backtracking;
import java.util.*;

// suppose the center block of 3X3 matric is the restriction and u cant go there, so u need to find the new paths to get to the finishing point.


public class MazeWithRestrictions {

    static ArrayList<String> arrlist = new ArrayList<String>();
    static void pathWithRestrictions(String p, boolean[][] maze, int rows, int cols){
        if(rows == 2 && cols == 2){
            arrlist.add(p);
            return;
        }
        if(maze[rows][cols] == false){
            return;
        }
        if(rows < 2){
            pathWithRestrictions(p+"D", maze, rows+1, cols);   // "D" means DOWN
        }
        if(cols < 2){
            pathWithRestrictions(p+"R", maze, rows, cols+1);   // "R" means RIGHT
        }
    }
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        pathWithRestrictions("", maze, 0, 0);
        System.out.println(arrlist);
    }
}
