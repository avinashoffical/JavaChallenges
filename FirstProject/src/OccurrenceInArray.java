class OccurrenceInArray {
    public static void main(String[] args) {
        System.out.println("Array occurrence Finder");
        int[] arr=ArrayUtilityMethod.inputArray();
        occurrence(arr);
    }

    public static void occurrence(int[] arr){
        int i=0;
        while(i< arr.length){
            int occ=0,j=0;
            while(j<arr.length){
                if(arr[i]==arr[j]){
                    occ++;
                }
                j++;
            }
            System.out.println(arr[i]+" occurred "+occ+" times");
            i++;
        }

    }
}
