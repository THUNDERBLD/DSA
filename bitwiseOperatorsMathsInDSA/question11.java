// find XOR of number from 0 to n

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = ans ^ i;
            System.out.println(i+" ("+(Integer.toBinaryString(i))+") : "+ans);
            // u can see the pattern of repeating of number every 4th numbers in the table is repeating itself 
            // therefore we can take num % 4 
            // if num % 4 = 0 then ans = num 
            // if num % 4 = 1 then ans = 1 
            // if num % 4 = 2 then ans = num + 1 
            // if num % 4 = 3 then ans = 0
        }

    }
}
