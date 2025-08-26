package in.project.Abstract;

public class Square extends Shape{

    private final double side;

    public Square(double side){
        this.side=side;
    }

    @Override
    public void calculateArea(){
        System.out.printf("Area of square with side %5.2f is %5.2f",side,Math.pow(side,2));
    }
}
