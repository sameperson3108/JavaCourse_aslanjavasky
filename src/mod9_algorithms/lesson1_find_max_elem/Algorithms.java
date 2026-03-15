package mod9_algorithms.lesson1_find_max_elem;

public class Algorithms {

    //O(1) - константная, не зависит от количества данных
    //O(log n) - логарифмическая, используется в основном в бинарном поиске
    //O(n) - линейные, зависит по мере увеличения входных данных
    //O(n log n)
    //O(n^2) - вложенный цикл
    //O(n^3)
    //O(2^n)
    //O(n!)


    static void main() {
        int[] numbers = {4, 16, 3, 8, 23, 2};

        long start = System.currentTimeMillis();
        System.out.println("max = " + getMaxNumber(numbers));
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println("min = " + getMinNumber(numbers));

        int index = 3;
        System.out.println("the element by index " + index + " is " + getElementByIndex(numbers, index));
    }

    public static int getMaxNumber(int[] numbers) {
        //O(n)
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    public static int getMinNumber(int[] numbers) {
        //O(n)
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        return min;
    }

    public static int getElementByIndex(int[] array,int index) {
        //O(1)
        return array[index];
    }
}
