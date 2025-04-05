// implement queues using stacks
import java.util.*;

public class question1 {

    static class myQueue{

        private Stack<Integer> first;
        private Stack<Integer> second;
    
        private myQueue(){
            this.first = new Stack<>();
            this.second = new Stack<>();
        }

        public void add(int item){
            first.add(item);
        }

        public int remove(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removedItem = second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removedItem;
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }

        public int peek(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peeked = second.peek();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }

        public void display(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            for(int i = second.size()-1; i >= 0; i--){
                System.out.print(second.get(i)+", ");
            }
            System.out.print("END");
        }
        
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.add(10);
        q.add(20);
        q.add(40);
        q.add(50);
        q.remove();
        q.display();
    }
}
