import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementSwapUsingList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("how many integers do you want to enter : ");
        int num= input.nextInt();
        System.out.println("Enter value of Integers");
        int i=1;
        while(i<=num){
            int str=input.nextInt();
            list.add(str);
            i++;
        }
        System.out.print("Enter the index number to swap : ");
        int x= input.nextInt();
        int y= input.nextInt();
        System.out.println(list);
        swap(list,x,y);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y){
        int swap=list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);
    }
}
