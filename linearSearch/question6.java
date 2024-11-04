// Find the maximum sum of the each rows in 2d array

import java.util.Scanner;

public class question6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of element in the row : ");
        int rows = sc.nextInt();
        System.out.print("No of element in the Cols : ");
        int cols = sc.nextInt();
        int[][] amount = new int[rows][cols];
        //Input from the user
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
               amount[i][j] = sc.nextInt();
            }
        }

        // better approach (complete)
        int max = 0;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += amount[i][j];
            }
            System.out.println("the sum of row : "+sum);
            if(sum > max){
                max = sum;
            }

        }
        System.out.println("the largest value : "+max);
    }
}
