import java.rmi.StubNotFoundException;

public class Student {

    int roll_no;
    String name;
    int age;

    public Student(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

    public static void main(String[] args) {
        Student newS=new Student(101,"shiv",19);
        System.out.println(newS);
    }
}
