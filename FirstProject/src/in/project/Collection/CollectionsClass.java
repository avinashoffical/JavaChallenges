package in.project.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(5);
        number.add(20);
        number.add(12);
        number.add(1);
        number.add(100);
        Utility.print(number);
        Collections.sort(number);
        Utility.print(number);
        Collections.reverse(number);
        Utility.print(number);
    }
}
