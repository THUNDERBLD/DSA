// find the character in the given string
public class question1 {
    public static void main(String[] args) {
        String name = "thunder";
        String target = "e";

        // first approach 
        String[] spl = name.split("");
        for(int i = 0; i < spl.length; i++) {
           if(target.equals(spl[i])){
            System.out.println("Character is found at index : "+ i);
           } 
        }

        // Another approach
        // char[] arr = name.toCharArray();
        // for(char c : arr){
        //     if(c == target){
        //         System.out.println("Element is present");
        //     }
        // }
    }
}
