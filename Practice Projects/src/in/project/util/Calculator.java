package in.project.util;

import in.project.geometry.Circle;
import in.project.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle cir=new Circle(5);
        Rectangle rec=new Rectangle(5,6);
        double cirArea=Math.PI*Math.pow(cir.radius, 2);
        double recArea= rec.length*rec.width;
        System.out.printf("Area of the circle is %f, Area of the rectangle is %f",cirArea,recArea);
    }
}
