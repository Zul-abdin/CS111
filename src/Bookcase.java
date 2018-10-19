public class Bookcase {

    public static void main(String[] args) {

        // Instantiating an object
        /*
         * "book1" and "book2" are references.
         */
        Book book1 = new Book("Harry Potter Book 1");
        Book book2 = new Book("Highlander");

        /*
         * the toString() method gets invoked by default
         * Each object gets its own toString() method
         *      - Each Object has its own unique method
         */
        System.out.println(book1);
        System.out.println(book2);

        //Invoke the instance method turnPage()
        book1.turnPage();

        // Turns 3 pages
        // invoke turnPage() 3 times
        book2.turnPage();
        book2.turnPage();
        book2.turnPage();

        System.out.println(book1);
        System.out.println(book2);

        //Turn 10 pages in book 1
        book1.multiPageTurn(10);

        System.out.println(book1);
        System.out.println(book2);

        // Using a different constructor to instantiate the same type of object, Book
        Book book3 = new Book("The Great Gatsby", "Some Random Dude");

        System.out.println(book3);

        Book book4 = new Book("Mortal Instrument", "Cassandra");

        System.out.println(book4.getAuthor());

        Book book5;

        //book4 refers to the same address in memory as book 2
        //The original book4 "Mortal Instrument" will be Garbage Collected
        book4 = book2;

        book3.setTitle("Calculus Textbook");

        System.out.println(book3);


    }

}
