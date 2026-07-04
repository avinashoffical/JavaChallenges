package in.project.Exception;

import java.util.Scanner;

public class ThrowAndThrows {

    public static int add(int num, int num2) throws ArithmeticException{
        throw new ArithmeticException("Arithmetic Exception");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Division calculator");
        System.out.print("Enter two number: ");
        int num1=input.nextInt();
        int num2= input.nextInt();
        System.out.println(add(num1,num2));
    }
}
