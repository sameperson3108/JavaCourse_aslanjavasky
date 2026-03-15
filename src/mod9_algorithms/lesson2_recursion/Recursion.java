package mod9_algorithms.lesson2_recursion;

public class Recursion {
    static void main() {
        //0! = 1
        //3! = 1 * 2 * 3
        // 123 132 213 231 312 321
        //5! = 1 * 2 * 3 * 4 * 5
        System.out.println(calculateFactorialIter(20));
        System.out.println(calculateFactorialRecursion(20));

        // throwStackOverflow(1); //StackOverflow
    }

    public static void throwStackOverflow(long n) {
        System.out.println(n++);
        throwStackOverflow(n);
    }

    public static long calculateFactorialRecursion(long n) {
        //O(n) - временная
        //O(n) - пространственная
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorialRecursion(n - 1);
    }

    public static long calculateFactorialIter(long n) {
        //O(n) - временная
        //O(1) - пространственная
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return  result;

    }
}
