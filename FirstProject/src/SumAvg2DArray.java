 class SumAvg2DArray {

     public static void main(String[] args) {
         System.out.println("2D Array Sum and Average");
         int[][] arr=ArrayUtilityMethod.input2dArray();
         double sum=sumArray(arr);
         double avg=avgArray(arr);
         System.out.println("Sum of array is "+sum);
         System.out.println("Average of array is "+avg);
     }

     public static double sumArray(int[][] narr){
         int sum=0,i=0;
         while(i<narr.length){
             int j=0;
             while(j<narr[i].length){
                 sum=sum+narr[i][j];
                 j++;
             }
             i++;
         }
         return sum;
     }

     public static double avgArray(int[][] narr){
         double v=(narr.length*narr[0].length);
         if(narr.length==0) return 0;
         return (sumArray(narr)/v);
     }
}
