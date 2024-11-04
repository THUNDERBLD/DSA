public class recursionPatterns {
    static void invertRightTriangle(int rows, int cols){
        if(rows == 0){
            return;
        }
        if(cols < rows){
            System.out.print("* ");
            invertRightTriangle(rows, cols+1);
        } else {
            System.out.println();
            invertRightTriangle(rows-1, 0);    
        }
    }
    
    static void RightTriangle(int rows, int cols){
        if(rows == 0){
            return;
        }
        if(cols < rows){
            RightTriangle(rows, cols+1);
            System.out.print("* ");      // this time the code will exicute when the stack is returning back or getting empty
        } else {
            RightTriangle(rows-1, 0);    
            System.out.println();       // this time the code will exicute when the stack is returning back or getting empty
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 0;
        invertRightTriangle(rows, cols);
        RightTriangle(rows, cols);
    }
}
