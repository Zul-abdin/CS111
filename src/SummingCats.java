public class SummingCats {
    public static void main(String[] args) {

        System.out.println("Enter Cats");
        int eCats = IO.readInt();

        System.out.println("enter aCats");
        int aCats = IO.readInt();

        if (eCats < 0 || aCats < 0) {
            System.out.println("error");
        }
        else{
            int sum = eCats + aCats;
            IO.outputIntAnswer(sum);
        }
    }
}