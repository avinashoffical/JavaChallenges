package in.project.Interface;

public class Eagle extends Bird{

    public Eagle(String eagle) {
        super(eagle);
    }

    @Override
    public void fly() {
        System.out.println(getBreed()+" is flying");
    }
}
