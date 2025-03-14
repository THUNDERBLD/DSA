
// In Java, a wrapper class allows you to treat primitive data types (like int, boolean, double) as objects, enabling their use in contexts that require objects.

public class wrapperClasses {

    static void swappingPrimitives(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swappingObjects(Integer x, Integer y){
        Integer temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        // trying to swapping primitive data types using function 
        int a = 10;
        int b = 20;
        swappingPrimitives(a, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);    // see the values are not swapped even after running the function. This is because primitive data types in Java are immutable, unlike wrapper classes.

        // now swapping non-primitive data types using wrapper classes 
        // here Integer is a wrapper class
        Integer x = 10;
        Integer y = 20;
        swappingObjects(x, y);
        System.out.println("After swapping: x = " + x + ", y = " + y);    // see the values are still not swapped after running the function. This is because wrapper classes are final, allowing their values not to be changed.

        // final keyword => this helps to make a variable constant( not to change values ), it is only implemented on primitive data types like int, char, float, etc.
        // final always have to initialize while declaring it
        final int bonus = 2;
        // bonus = 40;    // this gives error message
        System.out.println(bonus);
    }
}
