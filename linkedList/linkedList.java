// A Linked List is a linear data structure where elements (nodes) are linked using pointers. 
// Unlike arrays, linked lists do not have a fixed size, making them efficient for dynamic memory allocation.
// Structure of a Linked List in Java -> A linked list consists of nodes, each containing:
// Data – The actual value stored in the node.
// Next Pointer – A reference to the next node in the list.

// Types of Linked Lists
// Singly Linked List – Each node points to the next node.
// Doubly Linked List – Each node points to both the next and previous nodes.
// Circular Linked List – The last node connects back to the head.

// Key Components of a Linked List
// Head: The first node of the list. It is used to access the entire list.
// Tail: The last node of the list, which usually has its next pointer as null (in a singly linked list).
// Size: The number of nodes in the list.

// Time Complexity of Linked List Operations
// Insertion: O(1) (at head), O(n) (at tail or middle)
// Deletion: O(1) (at head), O(n) (searching for a node)
// Search: O(n) (traversing required)
// Access: O(n) (no direct indexing like arrays)


public class linkedList {
    // head and tail are just reference variables pointing to the nodes. 
    // because head and tail are of type Node, so they have head.value and head.next or tail.value and tail.next in them by default.
    private Node head;      // by default head is null
    private Node tail;      // by default tail is null
    private int size;       // by default size is 0
    
    public linkedList(){
        this.size = 0;
    }
    
    public void insertFirst(int value){
        Node node = new Node(value);  // creating a new node using one parameter constructor
        node.next = head;            // as we are inserting on first position of linkedList then its next should point to head(first element) 
        head = node;                // as we are inserting on first position of linkedList, new head = new node that is head = new node object
        if(tail == null){          // if tail is null then it means position of tail is same as head
            tail = head;
        }
        size++;    // size += 1          // incrementing size of linkedList    
    }

    public void insertLast(int value){
        if(tail == null){             // if tail is null then it means linkedList is empty       
            insertFirst(value);      // so we will insert first element in linkedList
            return;                 // returning from the function as we have inserted first element
        }
        Node node = new Node(value);  // creating a new node using one parameter constructor
        tail.next = node;            // as we are inserting on last position of linkedList then its next should point to new node
        tail = node;                // as we are inserting on last position of linkedList, new tail = new node that is tail = new node object
        size++;                    // size += 1          // incrementing size of linkedList
    }

    public void insertAtPosition(int value, int position){

        if(position == 0){
            insertFirst(value);      // if position is 0 then we will insert first element in linkedList
            return;                 // returning from the function as we have inserted first element
        }
        if(position == size){
            insertLast(value);       // if position is size then we will insert last element in linkedList
            return;                 // returning from the function as we have inserted last element
        }

        Node temp = head;                        // creating a temporary node to traverse the linkedList, so that we cannot change the structure of linkedList
        for(int i = 1; i < position; i++){      // we are running for loop from 1 because if we want to insert on 0th position then we can use insertFirst() function  // this loop will run until 1 is less than position - 1
            temp = temp.next;                  // moving to next node
        }
        Node node = new Node(value, temp.next); 
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value; // storing the value of head in a variable
        head = head.next;   // moving head to next node
        // edge case that if there is only one node then head and tail are equal then if that node will be removed then head will be null and tail will also be null
        if(head == null){
            tail = null;   // if head is null then tail is also null
        }
        size--;           // decrementing size of linkedList
        return val;      // returning the value of head
    }

    // since we cannot go backwards in singly linked list, we can only delete the last node by traversing the whole linked list then get the second last element and make it equal to tail
    public int deleteLast(){
        if(size <= 1){          // if size is less than or equal to 1 then we will delete first element
            return deleteFirst();      // so we will delete first element in linkedList // returning from the function as we have deleted first element
        }
        Node secondLast = get(size - 2); // getting the second last node
        int val = tail.value;   // storing the value of previous tail in a variable
        tail = secondLast;     // making second last node as tail
        tail.next = null;     // making next of second last node as null
        return val;          // returning the value of previous tail
    }


    public int delete(int index){
        if(index == 0){
            return deleteFirst();      // if index is 0 then we will delete first element in linkedList
        }
        if(index == size-1){
            return deleteLast();       // if index is size then we will delete last element in linkedList
        }
        Node prev = get(index - 1);
        int val = prev.next.value;   // storing the value of previous node in a variable
        prev.next = prev.next.next; // making next of previous node as next of next node
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node; // returning the node at index
    }

    public void display(){
        Node temp = head;           // creating a temporary node to traverse the linkedList, so that we cannot change the structure of linkedList 
        while(temp != null){       // this loop will run until temp is not null
            // edge case if linkedlist temp variable reaches to last node then next value will be null
            if(temp.next == null){ 
                System.out.print(temp.value + " -> null");
                break;                      // breaking the loop as we have reached the end of linkedList
            }
            
            System.out.print(temp.value + " -> ");
            temp = temp.next;               // moving to next node
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        // inserting at first
        list.insertFirst(11);
        list.insertFirst(24);
        list.insertFirst(42);

        // inserting at last
        list.insertLast(99);
        list.insertLast(100);

        // inserting at position
        list.insertAtPosition(50, 2); // inserting 50 at position 2

        // deleting at first position
        System.out.println("Deleted value: " + list.deleteFirst());  // deleting first element

        // deleting at last position
        System.out.println("Delete last value: " + list.deleteLast());  // deleting last element

        // deleting at position
        System.out.println("Deleted value at position 2: " + list.delete(2));  // deleting element at position 2

        list.display();
    }
}