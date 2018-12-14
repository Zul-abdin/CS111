package simple.math;

public class FibonacciNoRecursion {

    public static int fibonacci(int n){

        if(n == 0 || n == 1) return 1;
        int result = 0;
        int prevN = 1;
        int prev2N = 1;

        for(int i = 1; i < n; i++){
            result = prevN + prev2N;
            prev2N = prevN;
            prevN = result;
        }
        return result;
    }

}
