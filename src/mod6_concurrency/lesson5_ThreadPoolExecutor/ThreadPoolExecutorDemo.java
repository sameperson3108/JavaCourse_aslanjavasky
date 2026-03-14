package mod6_concurrency.lesson5_ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {
    static void main() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit( () -> {
            System.out.println("Task 1 executing...");
        });

        executor.submit( () -> {
            System.out.println("Task 2 executing...");
        });

        executor.shutdown();
    }
}
