package mod7_intern_for_Tbank;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = (long) (n + 100) * (n - 100 + 1)/2;

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
