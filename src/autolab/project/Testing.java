/*
 * To test the Song.java class
 */
package autolab.project;

public class Testing {

    public static void main(String[] args) {

        //Write Code Here
        Song song1 = new Song("song1");
        Song song2 = new Song("song2");
        Song song3 = new Song("song3");
        Song song4 = new Song("song4");
        Song song5 = new Song("song5");
        Song song6 = new Song("song6");
        Song song7 = new Song("song7");
        SongApp x = new SongApp(2);
        System.out.println(x.getNumberOfItems());
        x.addSong(song1);
        System.out.println(x.getNumberOfItems());
        x.addSong(song2);
        System.out.println(x.getNumberOfItems());
        x.addSong(song3);
        System.out.println(x.getNumberOfItems());
        x.addSong(song4);
        System.out.println(x.getNumberOfItems());
        x.addSong(song5);
        System.out.println(x.getNumberOfItems());
        x.addSong(song6);
        System.out.println(x.getNumberOfItems());
        x.removeSong(song4);
        System.out.println(x.getNumberOfItems());
        for(int i = 0; i < x.getSongs().length; i++){
           System.out.println(x.getSongs()[i]);
        }
        song1.addWriter("Lil Boi");
        song2.addWriter("Lil Boi");
        song3.addWriter("Lil Boi");
        song4.addWriter("Lil Boi");
        song5.addWriter("Lil Boi");
        song6.addWriter("Lil Boi");
        Song[] test = x.getSongsBySongwriter("Lil Boi");
        System.out.println();
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }

    }

}
