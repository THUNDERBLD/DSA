public class circularDynamicQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front; // pointer to the front of the queue
    private int end;  // pointer to the rear of the queue
    private int size; 

    private circularDynamicQueue(){
        this(DEFAULT_SIZE);   // just calling another constructor with the one argument in it.
    }

    private circularDynamicQueue(int size){
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
            int[] temp = new int[data.length*2];    // create a new array with double the size
            for(int i = 0; i < data.length; i++){ // copy the elements from the old array to the new array
                temp[i] = data[(front + i) % data.length]; // wrap around if the index goes beyond the size of the array
            }
            front = 0;
            end = data.length; // update the end pointer
            data = temp; // update the data pointer to the new array
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
        circularDynamicQueue cQueue = new circularDynamicQueue();
        for (int i = 1; i < 8; i++) {
            cQueue.add(i);   
        }
        cQueue.display();
        System.out.println("Removed: " + cQueue.remove());
        cQueue.display();
        System.out.println("Front: " + cQueue.front());
        cQueue.add(10);
        cQueue.display();
    }
}
