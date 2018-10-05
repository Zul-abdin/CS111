/*
 * Calculates total amount of snakes/lions/giraffes in US zoos
 */
public class Zoo {

    public static void main(String[] args) {

        int totalGiraffes = 0;
        int totalLions = 0;
        int totalSnakes = 0;

        System.out.print("Enter number of Zoos: ");
        int numZoos = IO.readInt();

        int count = 1;

        while(numZoos > 0){

            System.out.print("Enter number of giraffes for zoo " + count + ": ");
            int giraffes = IO.readInt(); //refers to amount of giraffes for zoo of number count

            System.out.print("Enter number of lions for zoo " + count + ": ");
            int lions = IO.readInt(); //refers to amount of lions for zoo of number count

            System.out.print("Enter number of snakes for zoo " + count + ": ");
            int snakes = IO.readInt(); //refers to amount of snakes for zoo of number count

            totalGiraffes += giraffes;
            totalLions += lions;
            totalSnakes += snakes;

            numZoos--;
            count++;

        }

        IO.outputIntAnswer(totalGiraffes);
        IO.outputIntAnswer(totalLions);
        IO.outputIntAnswer(totalSnakes);

    }

}
