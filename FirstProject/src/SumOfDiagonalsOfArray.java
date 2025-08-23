class SumOfDiagonalsOfArray {

    public static void main(String[] args) {
        System.out.println("Sum of diagonal of 2D Array");
        int[][] arr=ArrayUtilityMethod.input2dArray();
        long sum=sumofDiagonals(arr);
        System.out.println("Sum of diagonals is "+sum);
    }

    public static long sumofDiagonals(int[][] narr){
        int sum=0;
        int i=0;
        if(narr.length==0){
            return 0;
        }
        while(i<narr.length){
            int j=0;
            while(j<narr[i].length){
                if(i==j){
                    sum=sum+narr[i][j];
                }
                j++;
            }
            i++;
        }

        int k=0;
        while(k< narr.length){
            int n=0;
            while(n<narr[k].length){
                if(((k+n)==2) && k!=n){
                    sum=sum+narr[k][n];
                }
                n++;
            }
            k++;
        }
        return sum;
    }
}
