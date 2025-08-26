package in.project.Nested;

public class Test {
    public static void main(String[] args) {
        ArrayOperations ar=new ArrayOperations(new int[]{1,2,3,4,5});
        ArrayOperations.Statistics sat=ar.new Statistics();
        System.out.println(sat.mean());
    }
}
