import java.util.*;

public class question15 {
    // O(n)
    static void factors1(int num){
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                System.out.print(i + " ");
            }
        } 
    }
    // O(sqrt(n))
    static void factors2(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                if(num/i == i){
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" ");
                    list.add(num/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int num = 20;
        factors1(num);
        System.out.println();
        factors2(num);
    }
}
