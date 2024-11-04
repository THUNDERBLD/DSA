// Print pattern 1             Print pattern 2
// *                           * * * * *     
// * *                         * * * * *
// * * *                       * * * * *
// * * * *                     * * * * *

import java.util.*;

public class question1{

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            } System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
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