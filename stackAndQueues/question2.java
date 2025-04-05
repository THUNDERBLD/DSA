// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;

public class question2 {
    static int twoStacks(int x, int[] a, int[] b, int sum, int counter){
        if(sum > x) return counter - 1;
         // Try both options: take from a or b
         int ans1 = Integer.MIN_VALUE; 
         int ans2 = Integer.MIN_VALUE;

         if (a.length > 0 && sum + a[0] <= x) {
             ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], counter + 1);
         }
         if (b.length > 0 && sum + b[0] <= x) {
             ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], counter + 1);
         }
 
         // If both are invalid (i.e., both MIN_VALUE), return current counter
         return Math.max(counter, Math.max(ans1, ans2));
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 4, 6, 1};
        int[] b = {2, 1, 8, 5};
        int x = 10;
        System.out.println(twoStacks(x, a, b, 0, 0));
    }
}