// Print pattern 1             Print pattern 2
// * * * * *                    1
// * * * *                      1 2
// * * *                        1 2 3
// * *                          1 2 3 4
// *                            1 2 3 4 5

import java.util.Scanner;

public class question2 {

    // static void pattern1(int n){
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print("* ");
    //         } System.out.println();
    //     }
    // }
    
    // another approach for pattern1
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            } System.out.println();
        }
    }
    
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
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
