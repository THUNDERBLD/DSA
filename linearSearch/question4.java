// finding the element in 2D array
import java.util.Arrays;
import java.util.Scanner;

public class question4 {
    static void Search(int[][] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == n){
                    System.out.println("The element is found at the index of row : "+i+" and index of j : "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        // inputing the array and printing it out
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        } 
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.print("Enter the element u want to search : ");
        int n = sc.nextInt();
        Search(arr, n);
    }   
}
