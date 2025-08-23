 class ReversingArray {
     public static void main(String[] args) {
         System.out.println("Reverse a Array");
         int[] arr=ArrayUtilityMethod.inputArray();
         int[] arr2=reverseArray(arr);
         System.out.print("Array after reverse is ");
         ArrayUtilityMethod.printArray(arr2);
     }

     public static int[] reverseArray(int[] narr){
         int i=0;
//         int len=narr.length;
         while(i<narr.length/2){
             int swap=narr[i];
             narr[i]=narr[(narr.length-1)-i]; // narr[i]=narr[len-1];
             narr[(narr.length-1)-i]=swap; // narr[len-1]=swap;
             i++;
//             len--;
         }
         return narr;
     }
}
