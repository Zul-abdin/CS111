package simple.arrays;

import rutgers.cs.IO;

public class MaxWithArray {

    public static void main (String[] args) {

        int[] values = getValues(); // invoke getValues to read all inputs and store in array

        int max = values[0];
        for ( int i = 1; i < values.length; i++ ) {
            if ( max < values[i] ) {
                max = values[i];
            }
        /* OR
        max = Math.max(max, values[i]); */
        }
        System.out.println(max);
    }



    public static int[] getValues() {
        System.out.print("How many values: ");
        int n = IO.readInt();

        int[] array = new int[n]; // allocates an array of n integers

        // read in all n values from user
        for ( int i = 0; i < n; i++ ) {
            System.out.print("Enter next value: ");
            array[i] = IO.readInt(); // read user input, store into array index i
        }

        return array; // returns array
    }
}
