import java.util.Scanner;

public class Guessnumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Guess Number");
        int num;
        do{
            System.out.print("Please enter number from 0 to 10 to guess :");
            num=input.nextInt();
        }while(!guesser(num));
        System.out.println("You have guessed the number. congratulations!");
    }

    public static boolean guesser(int num){
        int numchoice=5;
        return numchoice==num;
    }
}
