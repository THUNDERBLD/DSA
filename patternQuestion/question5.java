// Print pattern 1             Print pattern 2
//     *                           *        *
//    * *                          **      **
//   * * *                         ***    ***
//  * * * *                        ****  ****
// * * * * *                       **********
//  * * * *                        ****  ****
//   * * *                         ***    ***
//    * *                          **      **
//     *                           *        *

import java.util.*;

public class question5 {

    static void pattern1(int n){
        for (int i = 1; i < (n*2); i++) {
            // upper portion of pattern
            if (i <= n) {
                // spacing
                for (int j = n-i; j >= 1; j--) {
                    System.out.print(" ");
                }         
                // stars           
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                // spacing
                for (int j = 1; j <= i-n; j++) {
                    System.out.print(" ");
                }         
                // stars           
                for (int j = 1; j <= (2*n)-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



    static void pattern2(int n){
        for (int i = 1; i <= (n*2); i++) {
            // upper portion of pattern
            if(i <= n){
                // stars           
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // spacing
                int space = (n*2)-(2*i);
                for (int j = 1; j <= space; j++) {
                    System.out.print("  ");
                }
                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                // stars
                for (int j = 1; j <= (n*2)-i; j++) {
                    System.out.print("* ");
                }
                // spaces
                int spaces = (i-n)*2;
                for(int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                } 
                // stars
                for (int j = 1; j <= (n*2)-i; j++) {
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
