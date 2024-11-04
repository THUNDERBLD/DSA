public class dele {

    static int pivot(int[] arr, int i){
        if(arr[i] >= arr[i+1]){
            return i;
        }
        return pivot(arr, i+1);
    }

    public static void main(String[] args) {
        String str = "thunder";
        
        System.out.println(str.substring(4));
    }
}
