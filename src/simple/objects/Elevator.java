package simple.objects;

public class Elevator {

    private int currentFloor;
    private int currentWeight;
    private int totalFloors;
    private int maxWeight;

    public Elevator (int totalFloors, int maxWeight){
        this.totalFloors = totalFloors;
        this.maxWeight = maxWeight;
    }

    public void goUp(){
        if (currentFloor++ > totalFloors){
            System.out.println("Already on top floor [" + totalFloors + "].");
        } else {
            currentFloor++;
        }

    }
    public void goDown(){
        if (currentFloor-- < 1){
            System.out.println("Already on bottom floor [Floor 1].");
        } else {
            currentFloor--;
        }
    }
    public void addPassenger(int passengerWeight){
        int newWeight = currentWeight + passengerWeight;
        if (newWeight > maxWeight) {
            System.out.println("Weight will be too high. Unable to add Passenger.");
        } else {
            currentWeight = newWeight;
        }
    }
    public void removePassenger(int passengerWeight){
        int newWeight = currentWeight + passengerWeight;
        if (newWeight < 0){
            System.out.println("Not enough passenger weight to decrease further. Please try again");
        } else {
            currentWeight -= passengerWeight;
        }
    }

}
