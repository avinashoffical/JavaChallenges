import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class CollectionsStringFrequency {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("how many integers do you want to enter : ");
        int num= input.nextInt();
        System.out.println("Enter value of Integers");
        int i=0;
        while(i<=num){
            int str=input.nextInt();
            list.add(str);
            i++;
        }
        System.out.print("Enter the number of which you want frequency : ");
        int find= input.nextInt();
        System.out.println(frequency(list,find));
    }

    public static int frequency(List list,int find){

        return Collections.frequency(list,find);
    }
}
