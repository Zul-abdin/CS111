package simple.recursion;

import rutgers.cs.IO;

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

    /*
     * Consider a line of n bunnies
     * Each odd bunny has 2 ears and each even bunny has 3 ears
     * returns the total number of ears
     */
    public static int BunnyEars (int n){

        if ( n == 1){     // Base Case

            return 2;
        }

        else if (n % 2 == 0){

            return 3 + BunnyEars(n-1); // Recursive Step <--- Makes n smaller

        } else {

            return 2 + BunnyEars(n-1); // Recursive Step <---- Makes n smaller

        }

    }
    /*
     * Sums the Blocks in a Pyramid of blocks
     * Basically factorial except with addition
     */
    public static int sumPyramidBlocks (int n){

        if (n == 1){

            return 1;

        } else {

            return n + sumPyramidBlocks(n-1);
        }

    }

    public static int Fibonacci (int n){

        if (n == 0 || n == 1){
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }

    }

    public static void printDescend(int n){

        if (n == 0){
            return;
        } else {
            System.out.println(n);
            printDescend(n-1);
        }

    }

    public static double Exponent ( double x, int m ){

        if ( m == 0 || x == 1 ) {
            return 1;
        } else {
            return Exponent(x,  m-1) * x;
        }

    }

    public static int repeats(String text, String word){
        if(text.indexOf(word) == -1){
            return 0;
        } else {
            return 1 + repeats(text.substring(0, text.indexOf(word)) + text.substring(text.indexOf(word) + word.length()), word);
        }
    }


}
