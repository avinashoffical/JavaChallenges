import java.util.Scanner;

class PalindromeRecursion {

    public static void main(String[] args) {
        System.out.println("Welcome to palindrome");
        Scanner input=new Scanner(System.in);
        String str= input.next();
        System.out.println("Your string is "+(isPalindrome(str)?
                "Palindrome":"Not Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int last=str.length()-1;
        if(str.charAt(0)!=str.charAt(last)){
            return false;
        }
        String newstr=str.substring(1,last);
        return isPalindrome(newstr);
    }
}
