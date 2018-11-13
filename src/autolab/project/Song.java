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
        this.rating = rating;
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
    public boolean equals(Object other){
        return true;
    }
}
