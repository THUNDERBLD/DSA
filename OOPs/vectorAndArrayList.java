// Feature	        |            ArrayList	                                              |          Vector
// Synchronization  |  Not synchronized (not thread-safe)	                              |  Synchronized (thread-safe)
// Performance	    |  Faster (no synchronization overhead)	                              |  Slower (due to synchronization)
// Growth Rate	    |  Increases by 50% when full	                                      |  Doubles its size when full
// Thread Safety	|  Not thread-safe (must use Collections.synchronizedList for safety) |	Thread-safe (built-in synchronization)
// Usage	        |  Used in single-threaded environments for better performance	      |  Used in multi-threaded environments where thread safety is required

// When to Use What?
// Use ArrayList if thread safety is not required (better performance).
// Use Vector if you need thread safety (but prefer alternatives like CopyOnWriteArrayList if possible).

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vectorAndArrayList {
    public static void main(String[] args) {
        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Faraz");
        arrayList.add("Aditya");
        arrayList.add("Subh");

        System.out.println("ArrayList: " + arrayList);
        // Iterating using a loop
        for (String name : arrayList) {
            System.out.println(name);
        }

        // Vector example
        Vector<String> vector = new Vector<>();
        vector.add("Faraz");
        vector.add("Aditya");
        vector.add("Subh");

        System.out.println("Vector: " + vector);
        // Iterating using a loop
        for (String name : vector) {
            System.out.println(name);
        }
    }
}
