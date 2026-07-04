
public class MaxArrayForEach {

    public static void main(String[] args) {
        System.out.println("Welcome to finding the Maximum");
        int[] arr=ArrayUtilityMethod.inputArray();
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
