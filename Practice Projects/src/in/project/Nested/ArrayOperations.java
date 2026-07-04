package in.project.Nested;

public class ArrayOperations {
    private int[] number;

    public ArrayOperations(int[] number) {

        this.number = number;
    }

    class Statistics{
        double mean(){
            double sum=0;
            for(int arr:number){
                sum+=arr;
            }
            return sum/number.length;
        }

        double median(){

            return 0;
        }

    }
}
