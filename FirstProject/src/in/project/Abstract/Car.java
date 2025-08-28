package in.project.Abstract;

public class Car extends Vehicle {

    public Car(int tyre){

        super(tyre);
    }

    @Override
    public void makeStart() {

        System.out.println("vroooooomm....");
    }

    @Override
    public void getSetGo() {

        System.out.println("Going to place");
    }
}
