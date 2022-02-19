import java.util.ArrayDeque;
import java.util.Queue;

public class BestUseCaseQueue {
    //when you are taking others in a restaurant for food, you will want to serve those that came first, first;
    //the best use case is use a queue
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Konalan");
        queue.offer("Emma");
        queue.offer("John");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
