import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {
        System.out.println("Welcome to Continue Working");
        int[] arr=ArrayUtilityMethod.inputArray();
        int sum=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                continue;
            }
                sum=sum+arr[i];
        }
        System.out.println("Sum of array is "+sum);
    }
}
