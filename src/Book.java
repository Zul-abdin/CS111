public class Book {

    // Instance Variables: Fields
    /*
     * Private - only accessible from inside the same class
     */
    private String title;
    private String author;
    private int pageNumber;


    /*
     * Constructor: a special method used to initialize the object and fill instance variables
     * NO return type
     * Same name as class name
     */
    public Book(String Booktitle){
        title = Booktitle;
        pageNumber = 0; //Assumes that the user has not read any pages
    }

    /*
     * String Representation of an object
     * Can be customized
     * Notice: no Static modifier b/c this is a method devoted to an object
     */
    public String toString() {
        return title + " [" + pageNumber + "] " + author;
    }

    //An instance method
    public void turnPage() {
        pageNumber += 1;
    }

    public void  multiPageTurn(int numberOfPages){
        pageNumber += numberOfPages;
    }

    public Book (String Booktitle, String Bookauthor){

        title = Booktitle;
        author = Bookauthor;

    }

    // Accessor Methods [get & set]
    public void setTitle ( String Booktitle) {
        title = Booktitle;
    }

    public String getTitle () {
        return title;
    }

    public void  setPageNumber ( int page) {
        pageNumber = page;
    }

    public int getPageNumber () {
        return  pageNumber;
    }

    public void setAuthor(String Bookauthor) {
        author = Bookauthor;
    }

    public String getAuthor() {
        return author;
    }
}
