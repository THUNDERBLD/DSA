
import java.util.Arrays;

// this is just a stack which will never gets fulled...

public class dynamicStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public dynamicStack(){
        this(DEFAULT_SIZE);   // just calling another constructor with the one argument in it.
    }

    public dynamicStack(int size){
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
            resizing(data);
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
    public int[] resizing(int[] arr){
        int[] temp = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return data = temp;
    }

    public static void main(String[] args) {
        dynamicStack stk = new dynamicStack();
        for (int i = 1; i < 8; i++) {
            stk.push(i);   
        }
        System.out.println(stk.pop());      // putting the pointer one step backwards
        System.out.println(Arrays.toString(stk.data));     // getting the top element
    }
}
