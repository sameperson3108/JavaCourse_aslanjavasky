package mod1_syntax.lesson19_functions;

public class FunctionDemo {
    static void main() {
        System.out.println("The sum of numbers 15 and 35 is " + sumOfTwoNumbers(15, 35));
    }

    public static long sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
}