package in.project.VariableAndArguments;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(1,2,3,4));
    }
// ... is know as ellipsis
    public static int sum(int... a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
