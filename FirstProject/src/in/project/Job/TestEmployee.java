package in.project.Job;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp=new Employee("Avi",27,500000);
        System.out.println(emp.getEmployee());
        emp.setName("Shiv");
        System.out.println(emp.getEmployee());
    }
}
