package mod4_collections.lesson5_queue;

import java.util.*;

public class QueueDemo {
    static void main() {

        //FIFO - first in first out
        Queue<String> queueNames = new PriorityQueue<>();

        queueNames.offer("Alice"); // offer практически то же самое, что и add, но более безопасен
        queueNames.offer("Bob");
        queueNames.offer("Charlie");

        String firstElement = queueNames.poll(); //poll - удаление первого элемента из очереди. Если нет элемента - возвращает null
//        String secondElement = queueNames.remove(); аналогично poll, но если элемента не существует - вылетает ошибка
        System.out.println("First element: " + firstElement);

        System.out.println(queueNames);
    }
}
