package in.project.inheritance;

public class TwoWheeler extends Vehicle{

    TwoWheeler(){
        setNumberOfWheels(2);
        color="black";
        price=100000;
    }

    public void drive(){
        System.out.println("I am driving on 2 wheeler");
    }
}
