import java.util.Scanner;

class AreaAndCirumOfCircle {

    double radius;

    AreaAndCirumOfCircle(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle radius is:"+radius+",Circumference is:"+circum()+" , Area is:"+area();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Find radius and circumference of circle");
        System.out.print("Enter radius of circle: ");
        double rad=input.nextDouble();
        AreaAndCirumOfCircle ac=new AreaAndCirumOfCircle(rad);
        System.out.println(ac);

    }

    double area(){
        return Math.PI*Math.pow(radius,2);
    }

    double circum(){
        return 2*Math.PI*radius;
    }
}
