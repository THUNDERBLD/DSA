import java.util.*;

public class circularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front; // pointer to the front of the queue
    private int end;  // pointer to the rear of the queue
    private int size; 

    private circularQueue(){
        this(DEFAULT_SIZE);   // just calling another constructor with the one argument in it.
    }

    private circularQueue(int size){
        this.data = new int[DEFAULT_SIZE];
        this.size = -1;
    }
    
    public boolean isFull(){
        return size == data.length; // if the pointer is at the last index of the array then it is full.
    }
    public boolean isEmpty(){
        return size == -1; // if the pointer is at the first index of the array then it is empty.
    }

    public int add(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return -1;
        }
        data[end] = item; // add the item to the end of the queue
        end = end % data.length; // wrap around if the end pointer goes beyond the size of the array
        end++; // increment the size of the queue
        size++; // increment the size of the queue
        return item; // return the item added
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[front]; // get the item at the front of the queue
        front = (front + 1) % data.length; // wrap around if the front pointer goes beyond the size of the array
        size--; // decrement the size of the queue
        return temp; // return the item removed
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front]; // return the item at the front of the queue
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length; // wrap around if the index goes beyond the size of the array
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) {
        circularQueue cQueue = new circularQueue();
        cQueue.add(10);
        cQueue.add(20);
        cQueue.add(30);
        cQueue.add(40);
        cQueue.add(50);
        cQueue.display();
        System.out.println(cQueue.remove());
        cQueue.add(90);
        
        cQueue.display();

    }
}
