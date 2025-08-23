class Merge2Array {
    public static void main(String[] args) {
        System.out.println("Merge 2 sorted array");
        int[] arr1=ArrayUtilityMethod.inputArray();
        int[] arr2=ArrayUtilityMethod.inputArray();
        int[] arr3=mergeArray(arr1,arr2);
        int[] arr4=sortArray(arr3);
        ArrayUtilityMethod.printArray(arr4);
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int i=0,j=0,k=0;
        int len=arr1.length+arr2.length;
        int[] arr3=new int[len];
        while(i<len){
            while(j<arr1.length){
                arr3[i]=arr1[j];
                j++;
                i++;
            }
            while(k<arr2.length){
                arr3[i]=arr2[k];
                k++;
                i++;
            }
        }
        return arr3;
    }

    public static int[] sortArray(int[] arr3){
        int i=0;
        while(i<arr3.length){
            int j=0;
            while(j< arr3.length){
                if(arr3[i]<arr3[j]){
                    int swap=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=swap;
                }
                j++;
            }
            i++;
        }
        return arr3;
    }
}
