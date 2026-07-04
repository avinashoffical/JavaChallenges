package in.project.Polymorphism;
//compile time  polymorphism
public class MethodOverloading {

    MethodOverloading(){
       System.out.println("Default constructor");
    }

    MethodOverloading(String message){
        System.out.println(message);
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        MethodOverloading mo1=new MethodOverloading("Parameter constructor");
        System.out.println(mo.add(5,4));
        System.out.println(mo1.add("Avi","nash"));
    }
}
