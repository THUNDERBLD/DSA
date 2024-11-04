// print the pattern 1       print the pattern 2
//   * * * * *                 
//    * * * *                  * * * * *
//     * * *                    *     *
//      * *                      *   *
//       *                        * *
//       *                         *  
//      * *                            
//     * * *                            
//    * * * *                             
//   * * * * *                        
    

import java.util.*;
public class question7 {

    static void pattern1(int n){
        for (int i = 1; i <= (n*2); i++) {
            if(i <= n){
                // spaces
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                // stars
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = (n*2)-i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i-n; j++) {
                    System.out.print("* ");
                } 

            } System.out.println();
        }
    }


    static void pattern2(int n){
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                for (int j = 1; j <= n-1; j++) {
                    System.out.print("* ");
                }
            }
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                    if (j > 1) {
                        for (int k = 1; k <= (n+2)-(space*2); k++) {
                            System.out.print(" ");
                        }
                    }
                }
            }
            space += 1;
            for (int j = n-1; j >= 2; j--) {
                if (i == j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int n = sc.nextInt();
        pattern1(n);
        System.out.println();
        pattern2(n);
    }    
}
