import java.util.Scanner;

class TableusingFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Multiplication table ");
        System.out.print("Enter a number to print its table : ");
        int number=input.nextInt();
        System.out.print("Enter a limit of table : ");
        int limit=input.nextInt();
        printtable(number,limit);
    }

    public static void printtable(int number, int limit){
        if(number==0){
            System.out.println("Multiplication table of number "+number+" is 0.");
        }else {
            for(int i=1;i<=limit;i++){
                System.out.println(number+"*"+i+"="+i*number);
            }
        }
    }
}
