 class ArrayMaxMin {
    public static void main(String[] args) {
        System.out.println("Find Max and Min value in Array : ");
        int[] arr=ArrayUtilityMethod.inputArray();
        int max=isMax(arr);
        int min=isMin(arr);
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }

    public static int isMax(int[] narr){
        if(narr.length==0){
            return Integer.MIN_VALUE;
        }
        int i=1;
        int max=narr[0];
        while(i<narr.length){
            if(narr[i]>max){
                max=narr[i];
            }
            i++;
        }
        return max;
    }

    public static int isMin(int[]narr){
        if(narr.length==0){
            return Integer.MIN_VALUE;
        }
        int i=1;
        int min=narr[0];
        while(i<narr.length){
            if(narr[i]<min){
                min=narr[i];
            }
            i++;
        }
        return min;
    }
}
