import java.util.*;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        // taking input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // taking output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        } System.out.println();
        // OR
        System.out.println(list);
        

        // Multi dimensional ArrayList 
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // firstly we have to initialize inside arrayList
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        } 
        // add elements
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());
                
            }
        } System.out.println(arr);
    }
}
