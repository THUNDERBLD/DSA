// example of permuation -> "abc" = [abc, bac, cab, bca, cba, acb]

// question -> give 2 numbers for 1-9 where each number represent three alphabets eg. 1 -> [a, b, c] 2 -> [d, e, f] and so on
// now what we have to do is when user pass any 2 numbers like 12 then we will get all the possible combinations of the alphabets related to 12.
// eg. 12 -> ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
// eg. 1 -> ["a", "b", "c"]

import java.util.ArrayList;

public class recursionPermutation {

    static ArrayList<String> arrList = new ArrayList<String>();

    static void permutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            arrList.add(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0'; 
        for(int i = (digit - 1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            permutation(processed + ch, unprocessed.substring(1));
        }
    }
    
    public static void main(String[] args) {
        permutation("", "12");
        System.out.println(arrList);
    }

}
