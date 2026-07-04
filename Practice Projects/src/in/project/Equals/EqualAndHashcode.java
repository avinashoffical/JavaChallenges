package in.project.Equals;

public class EqualAndHashcode {

    public static void main(String[] args) {
        Person person=new Person("AVI",31,"A001");
        Person person2=new Person("AVI",31,"A001");
        // for object when we use == that compares there address. and here they have different values.
//        if(person==person2){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
        //equal by default compares references
        if(person.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
