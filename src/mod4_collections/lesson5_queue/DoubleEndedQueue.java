package mod4_collections.lesson5_queue;

import java.util.*;

public class DoubleEndedQueue {
    static void main() {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addLast("Charlie");

        System.out.println(deque);

        String firstName = deque.removeFirst();
        String lastName = deque.removeLast();

        System.out.println("First element: " + firstName);
        System.out.println("Last element: " + lastName);
        System.out.println(deque);

        String first = deque.getFirst();
        String last = deque.getLast();

        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
