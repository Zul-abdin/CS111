/*
 * All recursive methods are written in this class
 *
 * A recursive algorithm must:
 * 1. Have a bare case
 * 2. Change its state and move toward the bare case (recursive case)
 * 3. Call itself recursively
 */
public class RecursiveMethods {

    public static int factorial (int n){

        if (n == 0 || n == 1){ // Base case

            return 1;

        } else {

            int result = n * factorial(n-1); // recursive step
            return result;
        }
    }

    /*
     * Prints the String x, n times.
     */
    public static void repeatedPrint(String x, int n){

        if (n == 0){

            return;

        } else {

            System.out.print(x + " ");
            repeatedPrint(x, n-1);
        }
    }

}
