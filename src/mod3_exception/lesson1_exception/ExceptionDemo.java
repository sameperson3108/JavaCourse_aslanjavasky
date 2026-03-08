package mod3_exception.lesson1_exception;

public class ExceptionDemo {
    static void main() {

        // Все exceptions являются подклассами класса Throwable


        int zero = 1;
        String str = "s";

        try {
            System.out.println("15 / zero = " + 15 / zero);
            System.out.println("The length of str " + str.length());

            int[] arr = {1, 3, 5};
            int elem = arr[2];

            int number = Integer.parseInt(str);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("String is null " + e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("The end of program");

    }
}
