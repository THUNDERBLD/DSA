// https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/

import java.util.Stack;

public class question5 {

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push('('); // Push opening bracket
                } else {
                    if (stack.isEmpty()) {
                        // No matching '(' found
                        if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                            count++; // One insertion needed
                            i++; // Skip next ')'
                        } else {
                            count += 2; // Need two insertions
                        }
                    } else {
                        // Matching '(' found
                        if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                            stack.pop();
                            i++; // Skip next ')'
                        } else {
                            count++; // Need one more ')'
                            stack.pop();
                        }
                    }
                }
            }

            return count + stack.size() * 2; // Each unmatched '(' needs two ')'
    }
    
    public static void main(String[] args) {
        int ans = minInsertions("()))()");
        System.out.println(ans);
    }
}
