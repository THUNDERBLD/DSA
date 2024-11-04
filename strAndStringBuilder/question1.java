// Check weather string is palindrome(element from starting to mid must be same to element from ending to mid) or not

public class question1 {

    static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        } return true;
    }

                    
    public static void main(String[] args){
        String str = "abcdcba";
        boolean ispalindrome = palindrome(str);
        if(ispalindrome){
            System.out.println("The string is palindrome string");
        } else {
            System.out.println("This is not a palindrome string");
        }
    }
}
