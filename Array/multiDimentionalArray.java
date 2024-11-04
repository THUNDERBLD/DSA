import java.util.Arrays;
import java.util.Scanner;

public class multiDimentionalArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = sc.nextInt();

        // int[][] arrName = new int[rows][column]
        // int[][] arrName = {
                        // {1,2,4},
                        // {5,6,7},
                        // {9,0,1}
        //}
        // giving number of column is not nessary
        int[][] arr = new int[rows][column];
    
        // taking input in 2D array
        // first loop if for rows
        for(int i = 0; i < rows; i++){   // if u take arr.length in first array then take "arr[i].length" in second array
            // second loop is for column                                                       |
            for(int j = 0; j < column; j++){   //   <------------------------------------------|         
                arr[i][j] = sc.nextInt();
            }
        }
        // taking output of 2D array
        System.out.println("The Old way to output is :-");
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+ " ");
            } System.out.println();
        }
        // OR 
        System.out.println("The New way to output is :-");
        for(int i = 0; i < rows; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        // OR
        System.out.println("The Another New way to output is :-");
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
