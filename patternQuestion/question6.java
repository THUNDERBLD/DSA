// print the pattern 1                    print the pattern 2
// 1                                      10 9 8 7 
// 23                                     6 5 4
// 456                                    3 2 
// 78910                                  1

import java.util.Scanner;

public class question6 {

    static void pattern1(int n){
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(counter+" ");
                counter++;
            } System.out.println();
        }
    }
    static void pattern2(int n){
        int counter = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n)-i; j++) {
                System.out.print(counter+" ");
                counter--;
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
