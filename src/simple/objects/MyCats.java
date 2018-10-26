package simple.objects;

public class MyCats {

    public static void main(String[] args) {

        /*
         * The "new" keyword does 2 things.
         * 1. Creates (instantiates) an object of type cat
         * 2. Call (invoke) the constructor
         */

        Cat baloo = new Cat("Baloo", "White", "Green");
        Cat flo = new Cat("Flo", "Black", "Golden");
        Cat lilo = new Cat("Lilo", "Tabby");
        lilo.setEyeColor("Brown");
        Cat ploc = new Cat("Ploc", "White", "Green");

        Cat lulu = null; //lulu is a reference pointing to null. Null is the default value for references.
        Cat ariel = new Cat("Lilo", "Tabby", "Brown");

        baloo.moveToBedroom();
        baloo.sleeping();
        System.out.println(baloo); //automatic invocation of the toString method

        flo.moveToLivingRoom();
        flo.playing();
        lilo.moveToBedroom();
        lilo.sleeping();
        ploc.moveToKitchen();
        ploc.eating();

        System.out.println(flo);
        System.out.println(lilo);
        System.out.println(ploc);



        System.out.println(lilo.equals(lulu));
        System.out.println(lilo.equals(ariel));

        String s1 = new String("Tom");
        String s2 = new String("Leo");
        String s3 = new String("Tom");

        int c = s1.compareTo(s2);
        // c > 0: s1 is greater than s2
        // c == 0: s1 and s2 are the same
        // c < 0: s1 is smaller than s2
        System.out.println("Comparing Tom to Leo: " + c);

        int c1 = s2.compareTo(s1);
        System.out.println("Comparing Leo to Tom: " + c1);

        int c2 = s1.compareTo(s3);
        System.out.println("Comparing Tom to Tom: " + c2);

    }
}
