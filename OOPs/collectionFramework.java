// The Collection Framework in Java is a set of interfaces and classes that provide a standardized way to store, manipulate, and retrieve data efficiently. 
// It is part of the java.util package and includes various data structures such as lists, sets, queues, and maps.

// Key Components of the Collection Framework:

// 1. Interfaces: These define the abstract data structures:
// Collection → Root interface of the framework.
// List → Ordered collection (e.g., ArrayList, LinkedList).
// Set → Unordered, unique elements (e.g., HashSet, TreeSet).
// Queue → Follows FIFO (e.g., PriorityQueue, LinkedList).
// Map → Key-value pairs (e.g., HashMap, TreeMap).

// 2. Implementing Classes: These provide concrete implementations:
// ArrayList → Dynamic array implementation.
// LinkedList → Doubly linked list.
// HashSet → Unordered set, backed by a hash table.
// TreeSet → Sorted set, implemented using a tree.
// HashMap → Key-value store, unordered.
// TreeMap → Sorted key-value store.

// 3. Utility Classes: Java provides helper classes like Collections (for sorting, searching, etc.) and Arrays (for working with arrays).

import java.util.ArrayList;
import java.util.List;

public class collectionFramework {
     public static void main(String[] args) {
        // Example of using ArrayList by collection framework which is present in the java.util class
        List<String> names = new ArrayList<>();
        names.add("Faraz");
        names.add("Aditya");
        names.add("Subh");
        
        System.out.println("Names List: " + names);
        
        // Iterating using a loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
