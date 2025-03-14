package backtracking;

public class nQueen {

    private static void printSolution(boolean[][] board) {
        for(boolean[] rows : board){
            for(boolean elements : rows){
                System.out.print(elements ? "Q " : "X ");
            } System.out.println();
        }
        
    }

    // checking all the places where we can put the queen on the board and also we are only checking from above rows, so that current placed queen can not cancel out each other 
    static boolean isSafe(boolean[][] board, int rows, int cols){
        // getting the minimum distance from queen to the top most row 
        for(int i = 0; i <= rows; i++){
            if(board[i][cols])
                return false;
        }

        // getting the minimum distance from queen to the left wall
        int maxLeft = Math.min(rows, cols);
        for(int i = 1; i <= maxLeft; i++){
            if(board[rows-i][cols-i])
                return false;
        }

        // getting the minimum distance from queen to the right wall
        int maxRight = Math.min(rows, board.length - cols - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[rows-i][cols+i])
                return false;
        }

        return true;
    }

    static int placingQueens(boolean[][] board, int rows) {
        if (rows == board.length) {
            printSolution(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int cols = 0; cols < board.length; cols++) {
            if(isSafe(board, rows, cols)){
                board[rows][cols] = true;
                count += placingQueens(board, rows+1);
                board[rows][cols] = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(placingQueens(board, 0));
    }
}
