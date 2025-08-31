import java.util.*;

class CustomComparator {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of string and 'Exit' to exit");
        while(true){
            String str=input.nextLine();
           if(str.equalsIgnoreCase("Exit")){
               break;
           }else{
               list.add(str);
           }
        }
        System.out.println(list);
        sortDes(list);
        System.out.println(list);
    }

    public static void sortDes(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if(o1.charAt(0)<o2.charAt(0)){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
    }
}
