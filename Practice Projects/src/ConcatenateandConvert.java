import java.util.Scanner;

public class ConcatenateandConvert {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your 1st name : ");
        String st= input.next();
        System.out.print("Enter your 2nd name : ");
        String st2= input.next();
        String fullName=st+st2;
        //      OR
//        fullName.concat(st).concat(st2);
//        System.out.println(fullName.toUpperCase());
        //     OR
        System.out.printf("%S",fullName);
    }
}
