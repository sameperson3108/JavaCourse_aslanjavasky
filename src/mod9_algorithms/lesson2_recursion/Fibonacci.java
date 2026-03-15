package mod9_algorithms.lesson2_recursion;

public class Fibonacci {

    public static long[] memo;

    static void main() {
        // Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... элемент равен сумме 2 предыдущих
        System.out.println(getFibonacciByIndexIter(8));
        //System.out.println(getFibonacciByIndexRecursion(4));
        System.out.println(getFibonacciByIndexRecursionWithMemo(4));
    }

    public static long getFibonacciByIndexRecursion(int index) {
        //O(2^n) - временная
        //O(n) - пространственная
        if (index == 0) return 0;
        if (index == 1) return 1;
        return getFibonacciByIndexRecursion(index - 1) + getFibonacciByIndexRecursion(index - 2);

    }

    private static long getFibonacciByIndexIter(int index) {
        //O(n) - временная
        //O(1) пространственная

        if (index == 0) return 0;
        if (index == 1) return 1;

        long a = 0;
        long b = 1;
        long result = a + b;
        for (int i = 2; i <= index; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static long getFibonacciByIndexRecursionWithMemo(int index) {
        //O(n) - временная
        //O(n) - пространственная
        memo = new long[index + 1];

        return fibonacciMemoHelper(index);
    }

    private static long fibonacciMemoHelper(int index) {

        if(index == 0) return 0;
        if(index == 1) return 1;

        if (memo[index] != 0) return memo[index];

        memo[index] = fibonacciMemoHelper(index - 1) + fibonacciMemoHelper(index - 2);

        return memo[index];
    }
}
