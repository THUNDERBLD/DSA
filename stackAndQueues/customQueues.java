import java.util.*;

public class customQueues {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public customQueues(){
        this(DEFAULT_SIZE);   // just calling another constructor with the one argument in it.
    }

    public customQueues(int size){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return ptr == data.length - 1; // if the pointer is at the last index of the array then it is full.
    }
    public boolean isEmpty(){
        return ptr == -1; // if the pointer is at the first index of the array then it is empty.
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[ptr] = item;
        ptr++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[0];
        for(int i = 1; i <= ptr; i++){
            data[i - 1] = data[i]; // shifting the elements to the left
        }
        ptr--;
        return temp;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[0];
    }

    public static void main(String[] args) {
        customQueues que = new customQueues();
        que.push(10);
        que.push(20);
        que.push(30);
        System.out.println(Arrays.toString(que.data));
        System.out.println("The first element is removed : "+que.remove());      // removing the first element
        System.out.println("The front element : "+que.front());       // checking the first element
        
        que.push(60);
        System.out.println(Arrays.toString(que.data));
    }
}
