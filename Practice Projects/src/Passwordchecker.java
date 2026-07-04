import java.util.Scanner;

class Passwordchecker {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Password checker");
        String pas;
        do{
            System.out.println("Enter a password");
            pas=n.next();
        }while(!validPassword(pas));
    }

    public static boolean validPassword(String pass){

        return pass.length()>6;
    }
}
