import java.util.Scanner;

public class ArrayUtilityMethod {
    public static int[] inputArray(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len=n.nextInt();
        int[] arr=new int[len];
        int i=0;
        while(i< arr.length){
            System.out.print("Enter the "+(i+1)+" value of array : ");
            arr[i]=n.nextInt();
            i++;
        }
        return arr;
    }

    public static int counter(int[] arr,int num){
        int j=0,c=0;
        while(j< arr.length){
            if(arr[j]==num){
                c++;
            }
            j++;
        }
        return c;
    }

    public static void printArray(int[] arr){
        int l=0;
        while(l<arr.length){
            System.out.print(arr[l]+" ");
            l++;
        }
    }

    public static int[][] input2dArray(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter length of row of an array : ");
        int len_row=n.nextInt();
        System.out.print("Enter length of column of an array : ");
        int len_col=n.nextInt();
        int[][] arr=new int[len_row][len_col];
        int i=0;
        while(i<len_row){
            int j=0;
            while(j<len_col){
                System.out.print("Enter the "+(i+1)+" row and "+(j+1)+" column element : ");
                arr[i][j]=n.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}
