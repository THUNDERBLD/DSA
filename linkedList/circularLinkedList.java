

public class circularLinkedList {

    private Node head;
    private Node tail;

    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while(temp != head);
            System.out.println(head.value + " (Head Value Again) ");
        }   
    }

    public void deleteValue(int value) {
        Node temp = head;

        if (temp.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do { 
            Node n = temp.next;
            if(n.value == value){
                temp.next = n.next;
                break;
            }
            temp = temp.next;            
        } while(temp.value != value);

    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value= value;
            this.next = next;
        }
    }
    
    
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        cll.insertFirst(1);
        cll.insertFirst(2);
        cll.insertFirst(7);
        cll.insertFirst(8);
        cll.insertFirst(9);

        // deleting the nodes
        cll.deleteValue(2);
        cll.deleteValue(1);
        // display
        cll.display();
    }
}
