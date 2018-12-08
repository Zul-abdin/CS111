package autolab.project;
/*
*
* This class implements a library of songs
*
* @author CS111 - Rutgers University
*
*/

public class SongApp {

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array

  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp () {
      // ADD YOUR CODE HERE
      items = new Song[5];
      numberOfItems = 0;
  }

  /*
  * One argument constructor creates array with user defines capacity
  *
  * @param capacity defines the capacity of the Song library
  */
  SongApp (int capacity) {
      // ADD YOUR CODE HERE
      items = new Song[capacity];
      numberOfItems = 0;
  }

  /*
  * Add a Song into the library (unsorted array)
  *
  * If the library is full (there is not enough space to add another Song)
  *   - create a new array with double the size of the current array.
  *   - copy all current Songs into new array
  *   - add new Song
  *
  * @param m The Song to be added to the library
  */
  public void addSong (Song m) {
      // ADD YOUR CODE HERE
      if(numberOfItems == items.length){
          Song[] temp = new Song[items.length * 2];
          for(int i = 0; i < items.length; i++){
              temp[i] = items[i];
          }
          temp[items.length] = m;
          items = temp;
      } else {
          items[numberOfItems] = m;
      }
      numberOfItems++;
  }

  /*
  * Removes a Song from the library. Returns true if Song is removed, false
  * otherwise.
  * The array should not become sparse after a remove, that is, all Songs
  * should be in consecutive indexes in the array.
  *
  * @param m The Song to be removed
  *
  */
  public boolean removeSong (Song m) {
      // ADD YOUR CODE HERE
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].equals(m)){
              for(int j = i; j < numberOfItems - 1; j++){
                  items[j] = items[j + 1];
              }
              numberOfItems--;
              items[numberOfItems] = null;
              return true;
          }
      }

      return false;
  }

  /*
  * Returns the library of songs
  *
  * @return The array of Songs
  */
  public Song[] getSongs () {
      // ADD YOUR CODE HERE
      return items;
  }

  /*
  * Returns the current number of Songs in the library
  *
  * @return The number of items in the array
  */
  public int getNumberOfItems () {
      // ADD YOUR CODE HERE
      return numberOfItems;
  }

  /*
  * Update the rating of Song @m to @rating
  *
  * @param @m The Song to have its ratings updated
  * @param @rating The new rating of @m
  * @return true if update is successful, false otherwise
  *
  */
  public boolean updateRating (Song m, int rating) {
      // ADD YOUR CODE HERE
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].equals(m)){
              items[i].setRating(rating);
              return true;
          }
      }
      return false;
  }

  /*
  * Prints all Songs
  */
  public void print () {
      // ADD YOUR CODE HERE
      for(int i = 0; i < numberOfItems; i++){
          System.out.println(items[i]);
      }
  }

  /*
  * Return all the Songs by @songwriter. The array size should be the
  * number of Songs by @songwriter.
  *
  * @param songwriter The songwriter's name
  * @param An array of all the Songs by @songwriter
  *
  */
  public Song[] getSongsBySongwriter (String songwriter) {
      // ADD YOUR CODE HERE
      Song[] result;
      int count = 0;
      for(int i = 0; i < numberOfItems; i++){
          for(int j = 0; j < items[i].getNumberOfWriters(); j++){
              if(songwriter.equals(items[i].getWriterAtIndex(j))){
                  count++;
                  break;
              }
          }
      }
      result = new Song[count];
      int index = 0;
      for(int i = 0; i < numberOfItems; i++){
          for(int j = 0; j < items[i].getNumberOfWriters(); j++){
              if(songwriter.equals(items[i].getWriterAtIndex(j))){
                  result[index] = items[i];
                  index++;
                  break;
              }
          }
      }
      return result;
  }

  /*
  * Return all the Songs released in @year. The array size should be the
  * number of Songs made in @year.
  *
  * @param year The year the Songs were made
  * @return An array of all the Songs made in @year
  *
  */
  public Song[] getSongsByYear (int year) {
      // ADD YOUR CODE HERE
      Song[] result;
      int size = 0;
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].getYear() == year){
              size++;
          }
      }
      int index = 0;
      result = new Song[size];
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].getYear() == year){
              result[index] = items[i];
              index++;
          }
      }
      return result;
  }

  /*
  * Return all the Songs with ratings greater then @rating
  *
  * @param rating
  * @return An array of all Songs with rating greater than @rating
  *
  */
  public Song[] getSongsWithRatingsGreaterThan (int rating) {
      // ADD YOUR CODE HERE
      Song[] result;
      int size = 0;
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].getRating() > rating){
              size++;
          }
      }
      int index = 0;
      result = new Song[size];
      for(int i = 0; i < numberOfItems; i++){
          if(items[i].getRating() > rating){
              result[index] = items[i];
              index++;
          }
      }
      return result;
  }

  /*
  * Search for Song name @name using binary search algorithm.
  * Assumes items is sorted
  */
  public Song searchSongByName (String name) {
      // ADD YOUR CODE HERE
      int lIndex = 0;
      int rIndex = items.length - 1;
      int mIndex;
      while(rIndex >= lIndex){
          mIndex = (lIndex + rIndex) / 2;
          if(items[mIndex] !=null && name.compareTo(items[mIndex].getName()) > 0){
              lIndex = mIndex + 1;
          } else if(items[mIndex] != null && name.compareTo(items[mIndex].getName()) < 0){
              rIndex = mIndex - 1;
          } else {
              return items[mIndex];
          }
      }
      System.out.println("Song Not Found");
      return null;
  }

 /*
  * Sorts Songs by year using insertion sort
  */
  public void sortByYear () {
      // ADD YOUR CODE HERE
      for(int i = 1; i < numberOfItems; i++){
          Song firstUnsorted = items[i];
          int endSorted = i - 1;
          while(endSorted >= 0){
              if(items[endSorted].getYear() > firstUnsorted.getYear()){
                  items[endSorted + 1] = items[endSorted];
                  endSorted -= 1;
              } else {
                  break;
              }
          }
          items[endSorted + 1] = firstUnsorted;
      }
  }

 /*
  * Sorts array of Songs by name using selection sort
  */
  public void sortByName () {
      // ADD YOUR CODE HERE
      for(int i = numberOfItems - 1; i > 0; i--){
          int maxloc = 0;
          for(int j = 1; j <= i; j++){
              if(items[j].getName().compareTo(items[maxloc].getName()) > 0){
                  maxloc = j;
              }
          }
          Song temp = items[maxloc];
          items[maxloc] = items[i];
          items[i] = temp;
      }
  }

 /*
  * Search for Song name using recursive linear search
  * @param name The name of the song to search
  * @param Songs The array containing all songs
  * @param l The left index
  * @param r The right index
  * @return The song with name @name or null if song is not found
  */
  public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
      // ADD YOUR CODE HERE
      if(l > r){
          System.out.println("Song Not Found");
          return null;
      } else {
          if(Songs[l] != null && Songs[l].getName().equals(name)){
              return Songs[l];
          } else {
              return searchSongByName(name, Songs, l + 1, r);
          }
      }
  }
}
