class IfArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("See if given Array is Sorted or not");
        int[] arr=ArrayUtilityMethod.inputArray();
        boolean isInc=isIncreasing(arr);
        boolean isDec=isDecreasing(arr);
        if(isInc||isDec){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] narr){
        int i=1;
        while(i<narr.length){
            if(narr[i]<narr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] narr){
        int i=1;
        while(i<narr.length){
            if(narr[i]>narr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
