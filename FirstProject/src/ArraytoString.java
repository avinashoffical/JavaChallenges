class ArraytoString {

    public static void main(String[] args) {
        String[] arr=new String[]{"This","is","the","best","and","most","deatailed","course"};
        StringBuilder sb=new StringBuilder();
        for(String str:arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}

// how can we append string with StringBuilder