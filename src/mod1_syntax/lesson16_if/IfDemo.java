package mod1_syntax.lesson16_if;

import java.util.Scanner;

public class IfDemo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an infant");
        }
        scanner.close();
    }
}
