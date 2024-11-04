// find the unique number in an array

public class question2 {
    static int unique(int[] arr){
        int unique = 0;
        for (int a : arr) {
            unique = unique ^ a;
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println("the unique number in array "+ unique(arr));
    }
}
