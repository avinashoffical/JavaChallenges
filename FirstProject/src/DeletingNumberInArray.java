import java.util.Scanner;

 class  DeletingNumberInArray {
    public static void main(String[] args) {
        System.out.println("Delete a number from Array ");
        int[] arr= ArrayUtilityMethod.inputArray();
        System.out.print("Enter the element you want to delete : ");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int[] arr2=arrDelete(arr,num);
        ArrayUtilityMethod.printArray(arr2);
    }

    public static int[] arrDelete(int[] arr,int num){
        int c= ArrayUtilityMethod.counter(arr,num);
        int[] narr=new int[arr.length-c];
        int k=0,m=0;
        while(k<arr.length){
            if(arr[k]!=num){
                narr[m]=arr[k];
                m++;
            }
            k++;
        }
        return narr;
    }
}
