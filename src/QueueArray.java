import java.util.*;
import java.util.LinkedList;

public class QueueArray {
    public static void main(String[] args) {
        int[] arr = {39,88, 102, 64, 128, 113, 124, 248, 46, 39,
                92, 117, 184, 351,52, 60, 104, 77, 208, 94
        };
        Queue<Integer> queue = new LinkedList<>();

        for (int num : arr) {
            queue.add(num);
        }

        System.out.println("Queue before delete 92 is: ");
        for (int data : queue) {
            System.out.print(data + "->");
        }
        System.out.println("null");

        Queue<Integer> newQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            int data = queue.remove();
            if (data !=92){
                newQueue.add(data);
            }
        }
        System.out.println("\nQueue after delete 92 is: ");
        for (int data : newQueue) {
            System.out.print(data + "->");
        }
        System.out.println("null");
    }
}
