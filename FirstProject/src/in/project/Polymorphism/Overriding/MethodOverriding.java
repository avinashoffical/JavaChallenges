package in.project.Polymorphism.Overriding;
// runtime polymorphism
public class MethodOverriding {

    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.speak();
        c.speak();

    }
}
