// what is the time complexity of given code

public class timeComplexity{

    public static void main(String[] args) {
        int N,K; // just the number which we dont know
        for(int i=1; i<=N; ){
            for (int j = 1; j <= K; j++) {
                // some operations
            }
            i = i + K;
        }
    }

}

// 2 different approaches

// the time complexity of the code is O(N), just give any value to N like 100 or so, and give any value to K like 5 or so...
// then after calculating the final value will comes the value of N, therefore the time complexity is O(N).
                               // OR
// O(Kt * no. of times the outer loop is running)   ----(1)     t is just time

// for finding the number of times the outer loop is running
// as we know i = 1, 1 + K, 1 + 2k, ..... , 1 + xK
// 1 + xK <= N   ->   xK <= N - 1
// x = (N - 1)/K   ---> this is the value of no. of times the outer loop is running and know put the value of x in eq-(1)
// O(Kt * (N-1)/K)   -->  O(N-1)   --> constants are ignored   -->  O(N)