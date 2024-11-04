// String refVariable = "Stored in Heap memory (object)";
// String pool -> it is just a saperate memory structure present in the heap memory (a saperate memory in heap, dedicated for the string) 
// Strings are immutable (it is immutable because of some security reasons)
// .equals method -> use when u only needs to check the values
// every output u see on the console/terminal is the type of String because in the backend println/print function just convert all the data types to the String formate so the we can read it
// fun fact when we use Arrays.toString() method at that time we are actually over-riding the to string method present in the println/print 
// java do not support operator overloading but only one exception that operator overloading is used in string to add(+) different data with strings in java 

import java.util.ArrayList;
import java.util.Arrays;

public class stringss{
    public static void main(String[] args) {
        // string pool
        String gameName = "thunder blood";   // string do not recreate a object in the memory (it takes object string pool)
        String name = "thunder blood";      // therefore gameName and name should be pointing towards same object(thunder blood) in heap(string pool)
        System.out.println(name); 
        System.out.println(gameName == name);  // checking for string pool (checking that the reference variable is pointing towards same object)


        // Immutability of the java
        String code = "programming"; // we are trying change its value but actually strings are immutable, so we will create a new object;
        System.out.println(code);  
        code = "program"; // here we are not actually changing the value, actually we are creating a new object which is stored in the code reference...
        System.out.println(code);  // now the old object will be removed by garbage collection


        // new keyword : lets create new objects (as we know that in java, string pool exist that stores objects inside it and if the two varibles are pointing towards same object then it wont create a new object for different reference varible therefore we will create it forcefully)
        String a = new String("faraz"); // it is actually values in heap but outside the string pool

        String b = new String("faraz"); 
        System.out.println(a == b);  // false because it is checking memory address plus value
        System.out.println(a.equals(b));  // true because it is only checking value


        // Indexing in String : use charAt() method
        String name1 = "Ayan";
        System.out.println(name1.charAt(2));


        // triming the String
        String name2 = "   Hajiman Best Geneus   nmnn";
        System.out.println(name2.trim());

        // replace and replaceAll
        String name3 = "  Remove all the spaces   ";
        System.out.println(name3.replaceAll(" ", ""));  // similary use replace but it will only replace one index at a time

        // concatenation of String and char
        System.out.println('a'+'b'); // concatenation of the char will give u character value therefore it will add those two character values
        System.out.println("a"+"b"); // concatenation of the string give u added string
        System.out.println((char)'a'+3); // return 100 as result because char value of a is 97 then we add 3 in it, which will results 100 ie. d
        System.out.println("a"+1); // result is a1 that means the entire input is converted into String
        System.out.println("Thunder"+ new ArrayList<>()); // result Thunder[] that means an string with empty array


        // Some methods of string
        String name4 = "thunder blood is faraz";
        System.out.println(Arrays.toString(name4.toCharArray()));
        System.out.println(Arrays.toString(name4.split(" ")));

    }
}