package mod1_syntax.lesson24_array;

import java.util.Arrays;

public class ArrayDemo {
    static void main() {
        int[] arrNumbers = new int[6];
        arrNumbers[0] = 4;
        arrNumbers[1] = 8;
        arrNumbers[2] = 15;
        arrNumbers[3] = 16;
        arrNumbers[4] = 23;
        arrNumbers[5] = 42;

        System.out.println(Arrays.toString(arrNumbers));

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("Index is " + i + ", the value is " + arrNumbers[i]);
        }

        int[] arrNumbers2 = {4, 8, 15, 16, 23, 42};
    }
}
