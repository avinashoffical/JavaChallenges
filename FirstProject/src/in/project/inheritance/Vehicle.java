package in.project.inheritance;

public class Vehicle {

    private int numberOfWheels;
    public String color;
    protected int price;

    public void setNumberOfWheels(int number){
        this.numberOfWheels=number;
    }


    public void commute(){
        System.out.printf("I am going from A to B using %d wheels \n",numberOfWheels);
    }
}
