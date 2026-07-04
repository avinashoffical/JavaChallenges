import java.util.Scanner;

public class OccurrencesWithForEach {

    public static void main(String[] args) {
        System.out.println("Welcome to Occurrences");
        int[] arr=ArrayUtilityMethod.inputArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number you want to search : ");
        int num=input.nextInt();
        int occ=countOcc(arr,num);
        System.out.println("Your Element was found "+occ+" times");
    }

    public static int countOcc(int[] narr,int num){
        int occ=0;
        for(int nums:narr){
            if(nums==num){
                occ++;
            }
        }
        return occ;
    }
}
