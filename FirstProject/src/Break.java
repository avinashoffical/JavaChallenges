import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Break working");
        String name;
        while(true){
            System.out.print("Enter word : ");
            name= input.next();
            if(name.equalsIgnoreCase("Exit")){
                break;
            }
        }
        System.out.println("Exited");
    }
}
