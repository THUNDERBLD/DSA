// Print pattern 1             Print pattern 2
// *                                     *
// * *                                 * * 
// * * *                             * * *
// * * * *                         * * * *
// * * * * *                     * * * * *
// * * * * * *                 * * * * * *
// * * * * *                    
// * * * *                      
// * * *                        
// * *                          
// *                            

import java.util.Scanner;

public class question3 {

    static void pattern1(int n){
        for (int i = 1; i <= (2*n)-1; i++) {
            if (i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                } System.out.println();
            } else {
                for (int j = (2*n)-i; j >= 1; j--) {
                    System.out.print("* ");
                } System.out.println();
            }
        }
    }
    // another approach(easy one but slow at the same time)
    // static void pattern1(int n){
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         } System.out.println();
    //     }
    //     for (int i = 1; i <= n; i++){
    //         for (int j = 1; j <= n-i; j++) {
    //             System.out.print("* ");
    //         } System.out.println();
    //     }
    // }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                    System.out.print(" *");                    
            } System.out.println();
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
