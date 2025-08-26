package in.project.Abstract;

public class TestShape {

    public static void main(String[] args) {
        Circle cir=new Circle(5);
        cir.calculateArea();
        System.out.println();
        Square sq=new Square(5);
        sq.calculateArea();
    }
}
