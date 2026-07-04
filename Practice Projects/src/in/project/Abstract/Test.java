package in.project.Abstract;

public class Test {

    public static void main(String[] args) {
        Car car=new Car(4);
        car.commute();
        car.makeStart();
        car.getSetGo();
        System.out.println(car.noOfTyres);
    }
}
