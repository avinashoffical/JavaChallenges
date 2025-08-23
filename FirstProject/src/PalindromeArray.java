class PalindromeArray {

    public static void main(String[] args) {
        System.out.println("Check if Array is palindrome or not");
        int[] arr=ArrayUtilityMethod.inputArray();
        checkPalindrome(arr);
    }

    public static void checkPalindrome(int[] narr){
        int len=narr.length;
        int i=0,c=0;
        while(i<len/2){
            if(narr[i]==narr[len-1]){
                c=1;
            }else {
                c=0;
                break;
            }
            i++;
            len--;
        }

        if(c==1){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
