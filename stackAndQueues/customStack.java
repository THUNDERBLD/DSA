
import java.util.Arrays;

// In the backend of Stack there is just a array, basically a stack is using array for its own implementation. 

public class customStack{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);   // just calling another constructor with the one argument in it.
    }

    public customStack(int size){
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
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){    // the pointer will only move one step back so that when the new element is added then it will override the new one. 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int item = data[ptr];
        ptr--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!!!");
            return -1;
        }
        return data[ptr];
    }

    public static void main(String[] args) {
        customStack stk = new customStack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        
        System.out.println(stk.pop());      // putting the pointer one step backwards
        stk.push(70);               // overwriting the previous element ie. 60; 
        System.out.println(Arrays.toString(stk.data));
    }
}