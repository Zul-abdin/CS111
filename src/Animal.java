public class Animal {

    private int height;
    private int weight;
    private int maxSpeed;
    private String name;
    private String typeOfAnimal;

    public Animal (){

    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String toString(){
        return name + " is a " + typeOfAnimal + " with [height,weight,maxSpeed] of " + "[" + height + "," + weight + "," + maxSpeed + "]";
    }

}
