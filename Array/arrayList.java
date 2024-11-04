
import java.util.ArrayList;

public class arrayList {
    // let suppose we need to give n number of inputs in array and dont want to define the size of array then use arraylist
    // it is similar to vectors in c++
    // In ArrayList size seames to be unfixed(not decleared) but it is actually fixed internally
    // ArrayList is initialize by some amount of size but when the element overfill the initial size then, it will create a new array inside it, with double size and copy all the element from old array to new one, and lastly delete the old array.
    // Let suppose the initial size is 2 then after onetime overfill the new size is 4, similarly next time size is 8, then 16 then 32 and so on...
    
    public static void main(String[] args) {
        // the syntex of arraylist
        ArrayList<Integer> thunder = new ArrayList<>(5); // u cant add primitives over here like int and char, instead we will add wrapper classes like Integer amd String
        // add
        thunder.add(11);
        thunder.add(32);
        thunder.add(42);
        thunder.add(52);
        thunder.add(62);
        thunder.add(72);
        thunder.add(382);
        // remove
        thunder.remove(3); // if there is a string then u can also use the exact same string to remove it
        // add first
        thunder.addFirst(55);
        // add last
        thunder.addLast(90);
        // replace
        thunder.set(0, 44);
        System.out.println(thunder); // the initial capacity is 5 but we have added more than 5 elements in this
        System.out.println(thunder.contains(32));

    }
}
