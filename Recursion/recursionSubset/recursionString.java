import java.util.*;

public class recursionString {
    // question 1 -> remove all the a from the string
    static String strFun(String str, int i, String ans){
        if(i == str.length()){
            return ans;
        }
        if(str.charAt(i) == 'a'){
            strFun(str, i+1, ans);
        } else {
            ans += str.charAt(i); 
        }
        return strFun(str, i+1, ans);
    }

    // question 2 -> remove the apple from the string
    static String strFun2(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return strFun2(str.substring(5));
        } else {
            return str.charAt(0) + strFun2(str.substring(1));
        }

    }

    //(use Debugger to understand this question's recursion tree) question 3 -> print all the sub set of abc string... eg -> "abc" -> ["a", "b", "c", "ab", "ac", "bc", "abc"," "] 
    // concept is accept the value or reject the value
    static ArrayList<String> arrlist = new ArrayList<>();
    static void subSequence(String p, String str){
        if(str.isEmpty()){
            arrlist.add(p);
            return;
        }
        char ch = str.charAt(0);
        subSequence(p+ch, str.substring(1));
        subSequence(p, str.substring(1));
    }

    public static void main(String[] args) {
        String ans = strFun("baccad", 0, "");
        System.out.println(ans);

        String ans2 = strFun2("bdcappledsa");
        System.out.println(ans2);

        subSequence("", "abc");
        System.out.println(arrlist);
    }
}
