package mod1_syntax.lesson17_do_while;

import java.util.Scanner;

public class WhileDemo {
    static void main() {

        int count = 0;

        //while
//        while (count < 3) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            if (age >= 18) {
//                System.out.println("You are an adult.");
//            } else if (age >= 13) {
//                System.out.println("You are a teenager");
//            } else {
//                System.out.println("You are an infant");
//            }
//            count++;
//            //scanner.close();
//        }
//        System.out.println("Exit from while cycle");

        //do-while
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult.");
            } else if (age >= 13) {
                System.out.println("You are a teenager");
            } else {
                System.out.println("You are an infant");
            }
            count++;
            //scanner.close();
        } while (count < 4);
        System.out.println("Exit from while cycle");
    }
}
