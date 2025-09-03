import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionReverse {

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
        System.out.print("Current List : "+list);
        reverse(list);
        System.out.println("After reverse : "+list);
    }

    public static void reverse(List<Integer> list){
         //Collections.reverse(list);
        for (int i = 0; i < list.size()/2; i++) {
            ElementSwapUsingList.swap(list,i,list.size()-1-i);
        }
    }
}
