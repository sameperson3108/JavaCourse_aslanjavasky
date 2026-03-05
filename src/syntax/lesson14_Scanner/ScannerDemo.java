package syntax.lesson14_Scanner;

import java.util.Scanner;

public class ScannerDemo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, my name is: " + name + " my age is: " + age);

    }
}
