package in.project.Passby;

public class PassByValue {
    //doesn't affect the original

    public static void main(String[] args) {
        int x=5;
        int y=10;
        System.out.println(add(x,y));
    }

    public static int add(int a,int b){
        return a+b;
    }
}
