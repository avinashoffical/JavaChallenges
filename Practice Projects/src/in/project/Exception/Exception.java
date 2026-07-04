package in.project.Exception;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Division calculator");
        System.out.print("Enter two number: ");
        int num1=input.nextInt();
        int num2= input.nextInt();
        try{
            System.out.println(num1/num2);
        }catch (ArithmeticException e) {
            System.out.println("Divide by 0 not allowed");
        }
    }
}
