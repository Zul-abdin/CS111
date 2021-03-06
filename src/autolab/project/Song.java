package autolab.project;

public class Song {
    private String name;
    private int year;
    private int numberOfWriters;
    private String[] writers;
    private int rating;

    public Song(String name){
        this.name = name;
        writers = new String[50];
        numberOfWriters = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setRating(int rating) {
        if(rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating Not Set: Rating has a range of [1,5].");
        }
    }
    public int getRating() {
        return rating;
    }

    public void addWriter(String writerName){
        int i;
        for(i = 0; i < writers.length; i++){
            if(writers[i] == null){
                break;
            }
        }
        if(i == 50){
            System.out.println("Writer Not Added: Maximum amount of writers has been reached (50).");
            return;
        }
        writers[i] = writerName;
        numberOfWriters++;
    }

    public String[] getWriters() {
        return writers;
    }
    public int getNumberOfWriters() {
        return numberOfWriters;
    }
    public String getWriterAtIndex(int index){
        return writers[index];
    }

    public String toString() {
        return name + ", " + year + ", " + rating;
    }
    public boolean equals (Object other){
        if (other == null || !(other instanceof Song)){
            return false;
        }

        Song s = (Song) other; //cast other into a Song object
        if (this.name.equals(s.getName()) && this.year == s.getYear()){
            int i, j; //Used to track for loops
            int countThis = 0, countS = 0; //Used to count the amount of nulls in writers array

            for(int k = 0; k < this.writers.length; k++){
                if(this.getWriterAtIndex(k) == null) countThis++;
                if(s.getWriterAtIndex(k) == null) countS++;
            }

            if(countThis != countS) return false;

            for(i = 0; i < this.writers.length; i++){
                for(j = 0; j < s.getWriters().length; j++){
                    if(this.writers[i] == s.getWriterAtIndex(j)){
                        break;
                    }
                }
                if(j >= this.writers.length){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    public int compareTo (Song other){
        return  this.name.compareTo(other.getName());
    }
}
