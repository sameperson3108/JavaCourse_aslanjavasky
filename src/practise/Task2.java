package practise;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int infected = getInfectedCount(n);

        System.out.println("Count of infected " + infected);
        scanner.close();
    }

    private static int getInfectedCount(int n) {
        if (n == 1) return 1;
        return 4 * (n - 1) + getInfectedCount(n - 1);
    }
}
