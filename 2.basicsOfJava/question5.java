// Reversing of the number input

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        for(int i = 0; num > 0; i++) {
            int some = num % 10;
            num /= 10;
            ans = ans *10 + some;
        } System.out.println(ans);
    }
}
