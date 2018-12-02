/*
 * To test the Song.java class
 */
package autolab.project;

public class Testing {

    public static void main(String[] args) {

        //Write Code Here
        Song song1 = new Song("Hi");
        Song song2 = new Song("Hello");
        Song song3 = new Song("Hey");
        Song song4 = new Song("Yo");
        Song song5 = new Song("Bye");
        Song song6 = new Song("Sup");
        SongApp x = new SongApp(5);
        x.addSong(song1);
        x.addSong(song2);
        x.addSong(song3);
        x.addSong(song4);
        x.addSong(song5);
        x.addSong(song6);
        song1.addWriter("Lil Boi");
        song2.addWriter("Lil Boi");
        song3.addWriter("Lil Boi");
        song4.addWriter("Lil Boi");
        song5.addWriter("Lil Boi");
        song6.addWriter("Lil Boi");
        Song[] test = x.getSongsBySongwriter("Lil Boi");
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println(x.getNumberOfItems());

        x.removeSong(song3);
        x.print();
        System.out.println(x.getNumberOfItems());

    }

}
