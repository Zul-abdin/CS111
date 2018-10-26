package autolab.assignment2;

import rutgers.cs.IO;

/*
 * Takes 2 int inputs and multiplies them
 */
public class Multiply {

    public static void main(String[] args) {

        //Ask for 2 inputs as integers
        System.out.println("Please enter 2 numbers to multiply.");

        //2 numbers being multiplied
        System.out.print("Enter integer: ");
        int num1 = IO.readInt();
        System.out.print("Enter integer: ");
        int num2 = IO.readInt();

        //The result of multiplying
        int product = num1 * num2;

        //Output result is product
        IO.outputIntAnswer(product);

    }

}
