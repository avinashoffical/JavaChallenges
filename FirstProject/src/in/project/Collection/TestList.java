package in.project.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<String> strList =new ArrayList<>();
        strList.add("Prashant");
        strList.add("Jain");
        strList.add(1,"kumar");
        strList.remove(0);
        if(strList.contains("Jain")){
            System.out.println("Jain exists");
        }
        System.out.println(strList.indexOf("Jain"));
        for (String s : strList) {
            System.out.print(s + " ");
        }
    }
}
