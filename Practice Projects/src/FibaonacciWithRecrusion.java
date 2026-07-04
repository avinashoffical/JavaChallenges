import java.util.Scanner;

public class FibaonacciWithRecrusion {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci ");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to print : ");
        int number= input.nextInt();
        for(int i=1;i<=number;i++){
            System.out.print(recfib(i)+" ");
        }
    }

    public static int recfib(int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return recfib(num-1)+recfib(num-2);
    }
}
