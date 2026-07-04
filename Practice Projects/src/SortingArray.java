import java.util.Scanner;

class SortingArray {
     public static void main(String[] args) {
         Scanner n=new Scanner(System.in);
         System.out.println("Sort the Array in Order");
         System.out.println("Press 1 For Ascending Order ");
         System.out.println("Press 2 For Descending Order");
         int choice=n.nextInt();
         int[] arr=ArrayUtilityMethod.inputArray();

         if(choice==1){
             int[] narr=ascending(arr);
             ArrayUtilityMethod.printArray(narr);
         }
         else if(choice==2){
             int[] narr2=descending(arr);
             ArrayUtilityMethod.printArray(narr2);
         }
         else{
             System.out.println("No choice selected");
         }
     }

     public static int[] ascending(int[] arr2){
         int i=0;
         while(i<arr2.length){
             int j=0;
             while(j<arr2.length){
                 if(arr2[i]<arr2[j]){
                     int swap=arr2[i];
                     arr2[i]=arr2[j];
                     arr2[j]=swap;
                 }
                 j++;
             }
             i++;
         }
         return arr2;
     }

    public static int[] descending(int[] arr2){
        int i=0;
        while(i<arr2.length){
            int j=0;
            while(j<arr2.length){
                if(arr2[i]>arr2[j]){
                    int swap=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=swap;
                }
                j++;
            }
            i++;
        }
         return arr2;
    }
}
