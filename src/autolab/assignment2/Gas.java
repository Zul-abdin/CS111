package autolab.assignment2;

import rutgers.cs.IO;

/*
 * Gives price for a stop at the gas station
 */
public class Gas {

    public static void main(String[] args) {

        System.out.print("Enter cost of gallon of gas: ");
        double gasPrice = IO.readDouble();

        System.out.print("Enter number of gallons: ");
        double gallons = IO.readDouble();

        if(gasPrice < 0 || gallons < 0){

            IO.reportBadInput();

        } else{

            double total = gallons * gasPrice;

            System.out.println("Is customer paying with a credit card? Enter true or false.");
            boolean creditCard = IO.readBoolean();

            if(creditCard){

                total *= 1.1;

            }

            IO.outputDoubleAnswer(total);

        }

    }

}
