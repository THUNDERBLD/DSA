// print the pattern 1       print the pattern 2
//       *                                       
//      * *                          1             
//     *   *                        1 1           
//    *     *                      1 2 1         
//   *       *                    1 3 3 1       
//   *       *                   1 4 6 4 1 
//    *     *                                 
//     *   *                   
//      * *                    
//       *                     

import java.util.Scanner;

public class question8 {

    // static void pattern1(int n){
    //     for (int i = 1; i <= (n*2); i++) {
    //         if(i <= n){
    //             // spaces
    //             for (int j = 1; j <= n-i; j++) {
    //                 System.out.print(" ");
    //             }
    //             // stars
    //             for (int j = 1; j <= 1; j++) {
    //                 System.out.print("* ");
    //             }
    //             // spaces
    //             for (int j = 1; j < i-1; j++) {
    //                 System.out.print("  ");
    //             }
    //             // stars
    //             for (int j = 1; j <= 1; j++) {
    //                 if(i > 1){
    //                     System.out.print("* ");
    //                 }
    //             }
    //         } else {
    //             // spaces 
    //             for (int j = 1; j < i-n; j++) {
    //                 System.out.print(" ");
    //             }
    //             // stars
    //             for (int j = 1; j <= 1; j++) {
    //                 System.out.print("* ");
    //             } 
    //             // spaces 
    //             for (int j = (n*2)-i-1; j >= 1; j--) {
    //                 System.out.print("  ");
    //             }
    //             // stars
    //             for (int j = 1; j <= 1; j++) {
    //                 if(i<10){
    //                     System.out.print("* ");
    //                 }
    //             }
    //         }
    //          System.out.println();
    //     }
    // }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
                // spaces
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                // Numbers
                for (int j = 1; j <= 1; j++) {
                    int a = (int) (Math.pow(11, i-1));
                    System.out.println(" "+a);
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int n = sc.nextInt();
        // pattern1(n);
        System.out.println();
        pattern2(n);
    }
}
