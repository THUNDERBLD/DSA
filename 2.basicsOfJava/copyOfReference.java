import java.util.Arrays;

public class copyOfReference {
    // in java u can use pass by reference, therefore u have to use copy Of Reference object to make changes    
    static void change(int[] nums){
        nums[0] = 99; // Now if u make some changes to the array then it will actually changes values in the main array
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // creating a array...
        change(arr);
        System.out.println(Arrays.toString(arr)); // if u simply passes arr in sout then it will give a garbage value, therefore u have to convert the array into string for printing it.
    }
}
