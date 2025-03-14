package backtracking;

import java.util.*;

// let suppose u can go in all directions inside the nXn matrix, then u have to go from (0,0) to (n,n) point. 
// but actually there is a problem in that case, because let suppose u are a the center of the matrix then u can also go back the starting point again, which will starting infinity recursion (Stackoverflow Exception).
// therefore we need to mark false to the points where we have already visited, so that recursion wont retrace its path again and again.
// marking cells as false is equal to i have that cell in my current path, so when that path is over, eg. u are in another recursion call then those cells should not be false, otherwise it wont trace the new path.
// Important point -> while u are moving back in recursion then u restore the current path, that means u can simply turn that current false state into true state again while moving back in the recursion calls.
// when do we go back -> whenever we get the potential answers from the lowest point of the recursion calls (when the function is returned), 
// This entire process is knowns as backtracking, in simple word how is my array looks like if i have not taken my current path in the recursion (basically going back to old states). 


public class actualBacktracking {

    static ArrayList<String> arrlist = new ArrayList<String>();
    static void pathBacktracking(String p, boolean[][] maze, int rows, int cols){
        if(rows == 2 && cols == 2){
            arrlist.add(p);
            return;
        }
        if(maze[rows][cols] == false){
            return;
        }
        // i am considering this block as my path
        maze[rows][cols] = false;
        if(rows < 2){
            pathBacktracking(p+"D", maze, rows+1, cols);    // "D" means DOWN
        }
        if(cols < 2){
            pathBacktracking(p+"R", maze, rows, cols+1);    // "R" means RIGHT
        }
        if(rows > 0){
            pathBacktracking(p+"U", maze, rows-1, cols);    // "U" means UP
        }
        if(cols > 0){
            pathBacktracking(p+"L", maze, rows, cols-1);    // "L" means LEFT
        }
        // this line is where my current function is over
        // so before the function gets removed then also remove the changes that were made by this function
        maze[rows][cols] = true;
    }


    static void pathBacktrackingPrint(String p, boolean[][] maze, int rows, int cols, int[][] path, int steps){
        if(rows == maze.length - 1 && cols == maze[0].length - 1){
            path[rows][cols] = steps;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[rows][cols]){
            return;
        }

        maze[rows][cols] = false;
        path[rows][cols] = steps;
        if(rows < maze.length - 1){
            pathBacktrackingPrint(p+"D", maze, rows+1, cols, path, steps+1);    // "D" means DOWN
        }
        if(cols < maze[0].length - 1){
            pathBacktrackingPrint(p+"R", maze, rows, cols+1, path, steps+1);    // "R" means RIGHT
        }
        if(rows > 0){
            pathBacktrackingPrint(p+"U", maze, rows-1, cols, path, steps+1);    // "U" means UP
        }
        if(cols > 0){
            pathBacktrackingPrint(p+"L", maze, rows, cols-1, path, steps+1);    // "L" means LEFT
        }
        maze[rows][cols] = true;
        path[rows][cols] = 0;
    } 

    public static void main(String[] args) {
        boolean[][] maze ={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        pathBacktracking("", maze, 0,0);
        System.out.println(arrlist);

        int[][] path = new int[maze.length][maze[0].length];
        pathBacktrackingPrint("", maze, 0, 0, path, 1);
    }
}
