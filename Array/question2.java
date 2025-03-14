// get the max element in array
public class question2 {

    public static void main(String[] args) {
        int[] arr = {2,3,4,54,68};
        int max = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("the max element is : "+max);
    }
}
