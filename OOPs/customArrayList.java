import java.util.*;

public class customArrayList {

    private int[] data;
    private final int INITIAL_CAPACITY = 10;  // initial capacity of the array
    private int size;
    
    public customArrayList(){
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    boolean isFull(){
        return size == data.length;
    }
    void resize(){
        // doubling the size of the array
        int[] temp = new int[data.length * 2];
        // copying all the elements from data array to temp array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    // adding elements to the array
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    // removing elements from the array by just going one step backwards which means now index is one step back 
    // then if any new elements is added then it will override the existing elements
    public int remove(){
        int removed = data[size--];
        return removed;
    }

    public int get(int i){
        return data[i];
    }

    public int size(){
        return size;
    }

    public void set(int i, int val){
        data[i] = val;
    }

    @Override
    public String toString(){
        return "Size: " + size + " Data: " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        customArrayList list = new customArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove();    // going one index backwards 
        list.add(9);   // overriding the existing value on that particular index
        System.out.println(list);
        list.set(2, 21);
        System.out.println(list);
        System.out.println(list.get(2));
    }  
}
