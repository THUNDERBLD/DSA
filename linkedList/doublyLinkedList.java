public class doublyLinkedList {

    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
    }

    public void insertLast(int value){
        Node temp = head;
        Node node = new Node(value);
        while(temp.next != null) temp = temp.next;
        node.prev = temp;
        node.next = null;
        temp.next = node;
    }

    public void insertAtPosition(int value, int position) {
        if(position == 0){
            insertFirst(value);      // if position is 0 then we will insert first element in linkedList
            return;                 // returning from the function as we have inserted first element
        }
        Node temp = head;
        Node node = new Node(value);
        for(int i = 0; i < position; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;       // ignore it -> only for displaying in reverse
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;   // ignore it -> only for displaying in reverse
            temp = temp.next;
        }
        System.out.print("null");

        System.out.println();
        // ignore it -> only for displaying in reverse
        while (last != null) { 
            System.out.print(last.value + " -> ");
            last = last.prev;
        } System.out.print("null");

    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.insertLast(90);
        list.insertLast(80);

        list.insertAtPosition(70, 2); // inserting 70 at position 2
        list.display();
    }
}
