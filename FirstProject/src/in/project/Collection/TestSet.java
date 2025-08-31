package in.project.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
         Set<String> names=new HashSet<>();
        System.out.println(names.add("avi"));
        System.out.println(names.add("pogo"));
        System.out.println(names.add("samy"));
        Utility.print(names);
        System.out.println(names.add("avi"));
        System.out.println(names.size());
        System.out.println(names.contains("avi"));
    }
}
