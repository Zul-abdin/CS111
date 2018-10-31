package simple.arrays;

import rutgers.cs.IO;

public class Grocery {

    public static void main (String[] args) {

        String[] groceryList = getGroceryList();
        printGroceryList(groceryList);
    }

    public static void printGroceryList (String[] list) {

        for ( int i = 0; i < list.length; i++ ) {
            System.out.println(i + ": " + list[i]);
        }
    }

    public static String[] getGroceryList () {
        System.out.print("How many items: ");
        int n = IO.readInt();

        String[] list = new String[n]; // list is an array of n references to Strings

        for ( int i = 0; i < n; i++ ) {
            System.out.print("Enter item: ");
            list[i] = IO.readString();
        }

        return list;
    }
}
