package in.project.Abstract;

public class Car extends Vehicle {

    public Car(){
        super(4);
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
