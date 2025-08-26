package in.project.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        Vehicle vech=new Vehicle();
        vech.commute();

        TwoWheeler twovehc=new TwoWheeler();
        twovehc.commute();
        twovehc.drive();


        Motorcycle moto=new Motorcycle();
        moto.commute();
        moto.drive();
        moto.start();
    }
}
