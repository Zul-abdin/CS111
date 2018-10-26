package autolab.assignment2;

import rutgers.cs.IO;

/*
 * Displays the result of how much a certain number of pounds of apple cost.
 */
public class BuyingApples {

    public static void main(String[] args) {

        System.out.print("Enter cost per LB: ");
        double costLB = IO.readDouble();

        System.out.print("Enter number of pounds: ");
        double numberOfLB = IO.readDouble();

        if ( costLB < 0 || numberOfLB < 0 ){

            IO.reportBadInput();

        } else {

            double totalCost = numberOfLB * costLB;

            IO.outputDoubleAnswer(totalCost);

        }

    }

}
