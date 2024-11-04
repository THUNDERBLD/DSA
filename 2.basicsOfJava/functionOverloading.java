
import java.util.Arrays;

// in function overloading we give same name to all the functions with different arguements, that means we are overloading the entire function
public class functionOverloading {
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a, String b){
        System.out.println(a);
        System.out.println(b);
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void fun(String ...a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        fun(55);
        fun(33,56);
        fun("thunder blood");
        fun(4, "thunder blood");
        fun(3,2,45,53,2,1);
        fun("thunder", "blood", "thunder blood");
    }
}
