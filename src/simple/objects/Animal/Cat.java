package simple.objects.Animal;

public class Cat extends Animal {

    public Cat (String name){
        setName(name);
        setTypeOfAnimal("Cat");
    }

    public void meow(){
        System.out.println(getName() + " is meowing...");
    }

}
