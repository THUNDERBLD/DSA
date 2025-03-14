package backtracking;

public class nKnights {

    static void printBoard(boolean[][] board) {
        for (boolean[] elem : board) {
            for(boolean elements : elem){
                System.out.print(elements ? "K " : "X ");
            } System.out.println();
        }
    }

    static boolean isValid(boolean[][] board, int rows, int cols){
        return rows >= 0 && rows < board.length && cols >= 0 && cols < board[0].length;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }
        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        return true;
    }

    static int counter = 0;
    static void placingKnights(boolean[][] board, int rows, int cols, int Knights){
        if(Knights == 0){
            printBoard(board);
            System.out.println();
            counter++;
            return;
        }
        if(rows == board.length - 1 && cols == board.length){
            return;
        }
        if(cols == board.length){
            placingKnights(board, rows + 1, 0, Knights);
            return;
        }
        if(isSafe(board, rows, cols)){
            board[rows][cols] = true;
            placingKnights(board, rows, cols + 1, Knights - 1);
            board[rows][cols] = false;
        }
        placingKnights(board, rows, cols + 1, Knights);
    }


    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placingKnights(board, 0, 0, n);
        System.out.println(counter);
    }
}
