/*
 * To test the Song.java class
 */
package autolab.project;

public class Testing {

    public static void main(String[] args) {

        //Write Code Here
        Song song1 = new Song("Hi");
        Song song2 = new Song("Hi");
        song1.addWriter("Tom");
        song1.addWriter("Todd");
        song2.addWriter("Todd");
        song2.addWriter("Tom");
        song1.setYear(1998);
        song2.setYear(1999);
        System.out.println(song1.equals(song2));

    }

}
