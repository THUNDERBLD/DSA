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


// Approach with arraylist

// public static void main(String[] args) {
//     int[][] arr = {{5,1,8},{12,4,7},{0,9,6}};
//     for(int[] i : arr){
//         System.out.println(Arrays.toString(i));
//     }
//     ArrayList<Integer> sumRows = new ArrayList<Integer>();
//     int sum = 0;
//     for(int i = 0; i < arr.length; i++){
//         sum = 0; // Resetting the sum for each row
//         for(int j = 0; j < arr[i].length; j++){
//             sum = sum + arr[i][j];
//         }
//         sumRows.add(sum); // Corrected variable name
//     }
//     System.out.println(Arrays.toString(sumRows.toArray()));
    
//     int max = sumRows.get(0);
//     int rowIndex = 0;
//     for(int i = 0; i < sumRows.size(); i++){
//         if(sumRows.get(i) > max){
//             max = sumRows.get(i);
//             rowIndex = i; // Keep track of the row index
//         }
//     }
//     System.out.println("The max sum of row : " + rowIndex + " is : " + max);
// }
