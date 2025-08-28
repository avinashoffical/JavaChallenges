package in.project.Abstract.Shape;

public class Circle extends Shape {
    
    private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public void calculateArea() {
        System.out.printf("Area of circle with radius %5.2f is %5.2f",radius,Math.PI*Math.pow(radius,2));
    }
}
