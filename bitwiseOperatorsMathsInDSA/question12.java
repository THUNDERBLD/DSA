// Find XOR in range 

import java.util.Scanner;

public class question12 {

    static void XOR(int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            switch (i % 4) {
                case 0 -> ans = i;
                case 1 -> ans = 1;
                case 2 -> ans = i + 1;
                case 3 -> ans = 0;
                default -> {
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inital number : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number : ");
        int end = sc.nextInt();
        XOR(start, end);
    }
}
