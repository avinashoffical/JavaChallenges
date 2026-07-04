class SumAverageOfArray {

    public static void main(String[] args) {
        System.out.println("Find Sum and Average of Array  ");
        int[] arr=ArrayUtilityMethod.inputArray();
        double sum=arraySum(arr);
        double avg=arrayAvg(arr);
        System.out.println("Sum of array is : "+sum);
        System.out.println("Average of array is : "+avg);
    }

    public static double arraySum(int[] arr){
        int i=0;
        double sum=0;
        while(i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        return sum;
    }

    public static double arrayAvg(int[]  arr){
        double sum=arraySum(arr);
        return (sum/arr.length);
    }
}
