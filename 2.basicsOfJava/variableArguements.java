
import java.lang.reflect.Array;
import java.util.Arrays;

public class variableArguements {
    // varArgs(variable arguments or variable no. of arguements) are used when u dont know how many arguements are going to passed to the function
    static void fun(int ...thunder){
        System.out.println(Arrays.toString(thunder));
    }
    static void fun2(String ...ali){
        System.out.println(Arrays.toString(ali));
    }
    static void multiple(int a, int b, int ...v){
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
    public static void main(String[] args) {
        fun(2,3,4,5,6);
        fun();
        fun2("hagiman", "nigga mon", "lil nigga", "hicha");
        multiple(3, 2, 3,4,2,21);
    }   
}
