// Set or Reset a bit on particular index 


// the writen solution is absolutly correct
public class question4 {
    // set bit means convert bit from 0 to 1
    // we can set a bit by making a of that index, so that masked index will become 1 then |(OR) it with number
    static void setBit(int num, int initial, int shifts){
        int mask = initial << shifts;
        int val = num | mask;
        System.out.println("The set bit "+val);
    }

    // reset bit means convert bit from 1 to 0
    // we can reset a bit by making a mask of that index then complement it, so that masked index will become 0 then &(AND) it with number
    static void resetBit(int num, int initial, int shifts){
        int mask = initial << shifts;
        int complementMask = ~mask;
        int val = num & complementMask;
        System.out.println("The reset bit "+val);
    }

    public static void main(String[] args) {
        int num = 10;
        int initial = 1;
        setBit(num, initial, 2);
        resetBit(num, initial, 1);
    }    
}
