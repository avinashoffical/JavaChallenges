
import java.util.Scanner;

class PrimeUsingFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Prime number Checker");
        System.out.print("Enter the number : ");
        int number=input.nextInt();
        prime(number);
    }

    public static void prime(int number){
        int c=0;
        if(number==1){
            c=2;
        }else{
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    c++;
                }
            }
        }
        System.out.println(c==2?"Number is Prime":"Number is not Prime");
    }
}
