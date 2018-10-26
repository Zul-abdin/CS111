package simple.objects;

/*
 * Blueprint for Cat object
 */
public class Cat {

    //Private fields are only accessible from inside the class
    private String name;
    private String furColor;
    private String eyeColor;
    private String position; // bedroom, kitchen, living-room
    private String status; // sleeping, awake, eating, playing

    //Constructor is called by new to initialize the object
    public Cat (String name, String furColor){
        this.name = name; // Keyword "this" means this class or this object
        this.furColor = furColor;
    }

    public Cat (String name, String furColor, String eyeColor){
        this.name = name;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // No method to set fur color because it cannot change
    public String getFurColor() {
        return furColor;
    }

    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void moveToLivingRoom(){
        position = "Living Room";
    }

    public void moveToBedroom(){
        position = "Bedroom";
    }

    public void moveToKitchen(){
        position = "Kitchen";
    }

    public void sleeping(){
        status = "Sleeping";
    }

    public void eating(){
        status = "Eating";
    }

    public void playing(){
        status = "Playing";
    }

    public String toString(){
        return name + ": " + furColor + ", " + eyeColor + ", " + position + ", " + status;
    }

    //Every class must provide an equals method in order to compare the object against another object of the same type.
    //Must have the following signature: public boolean equals (Object other)
    // "other" is a reference pointing to null
    public boolean equals (Object other){
        if (other == null || !(other instanceof Cat)){
            return false;
        }

        Cat c = (Cat) other; //cast other into a Cat object
        return this.name.equals(c.name) && this.furColor.equals(c.getFurColor()) && this.eyeColor.equals(c.eyeColor);
    }

    //The compareTo Method
    public int compareTo (Cat other){
        //invoking the compareTo method from the String class to compare the names of the two Cat objects
        return this.name.compareTo(other.name);
    }
}
