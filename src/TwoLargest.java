public class TwoLargest {

    public static void main(String[] args) {

        int count = 0;  //Counts how many values (excluding the terminating values) have been entered by the user
        double largestVal = 0;  //The Largest Value
        double secLargestVal = 0;   //The Second-Largest Value
        boolean termination = true; //Tells the while loop when to stop

        //Asks and sets the Terminating Value
        System.out.print("Enter the Terminating Value: ");
        double termVal = IO.readDouble();


        while( termination ){

            System.out.print("Enter a Data Value or Terminating value: ");
            double dataVal = IO.readDouble();

            //Checks if at least 2 data points have been entered and stops the loop
            if ( dataVal == termVal && count >= 2 ){
                termination = false;

            } else if ( dataVal == termVal && count < 2 ){
                System.out.println("Must enter at least two data values.");

            } else {

                //Sets the largest and second-largest values based on data points and increments count
                if (dataVal > largestVal) {
                    //NOTE: If the Largest Value already has a value and dataVal is bigger, then the current largestVal must become the Second-Largest Value
                    double temp = largestVal;
                    largestVal = dataVal;
                    secLargestVal = temp;

                } else if (dataVal > secLargestVal) {
                    secLargestVal = dataVal;
                }

                count++;
            }

        }

        IO.outputDoubleAnswer(largestVal);
        IO.outputDoubleAnswer(secLargestVal);

    }

}
