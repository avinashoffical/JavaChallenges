public class VarArgProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to Variable Arguments concatenation ");
        String ret=concate("Avi","nash"," "," Agra","hari");
        System.out.println(ret);
    }

    public static String concate(String... Str){
        StringBuilder con=new StringBuilder();
        for(String i:Str){
            con.append(i);
        }
        return con.toString();
    }
}
