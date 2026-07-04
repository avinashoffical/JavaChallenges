package in.project.Collection;

import java.util.Collection;

public class Utility {

    public static <E> void print(Collection<E> collection){
        for (E obj:collection) {
            System.out.print(obj+" ");
        }
        System.out.println();
    }
}
