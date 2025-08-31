package in.project.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        System.out.print("Elements in queue :");
        Utility.print(queue);
        System.out.print("first element in queue : ");
        System.out.println(queue.element());
        System.out.println("Removing first element from queue");
        queue.remove();
        System.out.print("After removal, first element in queue : ");
        System.out.println(queue.peek());

//        for (Integer i:queue) {
//            System.out.print(i+" ");
//        }
    }
}
