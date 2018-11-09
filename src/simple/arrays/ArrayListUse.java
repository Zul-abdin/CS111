package simple.arrays;

import java.util.ArrayList;

public class ArrayListUse {

    public static void main(String[] args){

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("slug");
        animals.add("pony");
        animals.add("cat");
        for(String i: animals){
            System.out.println("[" + animals.indexOf(i) + "] - " + i);
        }
        System.out.println("--------- number of items: " + animals.size());
        animals.add("dog");

        for(String i: animals){
            System.out.println("[" + animals.indexOf(i) + "] - " + i);
        }
        System.out.println("--------- number of items: " + animals.size());
        animals.remove("slug");

        for(String i: animals){
            System.out.println("[" + animals.indexOf(i) + "] - " + i);
        }
        System.out.println("--------- number of items: " + animals.size());

    }

}
