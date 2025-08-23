import java.util.Scanner;

class SearchIn2DArray {
    public static void main(String[] args) {
        System.out.println("Search a number in 2D Array");
        int[][] arr=ArrayUtilityMethod.input2dArray();
        System.out.print("Enter the element to search in array : ");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        boolean found=searchElement(arr,num);
        if(found) System.out.println("Element is in the group");
        else System.out.println("Element is not in the group");
    }

    public static boolean searchElement(int[][] arr1, int num){
        int i=0;
        while(i<arr1.length){
            int j=0;
            while(j<arr1[i].length){
                if(arr1[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
