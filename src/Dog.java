public class Dog extends Animal {

    private String breed;

    public Dog (String name){
        setName(name);
        setTypeOfAnimal("Dog");
    }

    public void bark(){
        System.out.println(getName() + " is Barking...");
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}