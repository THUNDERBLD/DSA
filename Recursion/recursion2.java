public class recursion2 {

    // 1342 => 1+3+4+2 = 10
    static int sumOfDigit(int num, int ans){
        if(num <= 0){
            return ans;
        }
        int val = num % 10;
        return sumOfDigit(num/10, ans+val);
    }

    static int concept(int num){
        // use --n in recursion instead of n-- because n-- means first pass the value of n the after the loop complete then decrement it therefore in recursion, it causes stack overflow error
        if(num == 0){
            return num;
        }
        System.out.println(num);
        return concept(--num);
    }

    // reverse the number by string using recursion
    static String RevNum(int num, String ans){
        if(num == 0){
            return ans;
        }
        int val = num%10;
        return RevNum(num/10, ans+val+"");
    }

    // reverse the number by integer using recursion
    static int RevNum2(int num, int ans){
        if(num == 0){
            return ans;
        }
        int val = num%10;
        return RevNum2(num/10, ans*10+val);
    }

    // Check waether a number is palindrome or not
    static boolean palindrome(int num, int ans, int some){
        if (num == 0) {
            if (ans == some) {
                return true;   
            } else {
                return false;
            }
        } 
        int val = num % 10;
        return palindrome(num/10, ans*10+val, some);
    }

    static int noOfZero(int num, int ans){
        if(num == 0){
            return ans;
        }
        int val = num % 10;
        if(val == 0){
            return noOfZero(num/10, ans+1);
        }
        return noOfZero(num/10, ans);
    }

    static int reduceNumToZero(int num, int ans){
        if(num == 0){
            return ans;
        }
        if(num % 2 == 0){
            return  reduceNumToZero(num/2, ans+1);
        } else{
            return  reduceNumToZero(num - 1, ans+1);
        }
    }

    public static void main(String[] args) {
        int num = 1342;
        int ans = 0;
        System.out.println(sumOfDigit(num, ans));
        System.out.println(concept(5));
        System.out.println("reverse the number by String using recursion : "+RevNum(num, ""));
        System.out.println("reverse the number by integer using recursion : "+RevNum2(num, ans));

        int some = 1245421;
        if (palindrome(some, ans, some) == true) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }

        System.out.println("no. of zeros : "+noOfZero(10203000, ans));
        System.out.println("no. of counts to make a num zero : "+reduceNumToZero(41, ans));
    }
}
