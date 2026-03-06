package mod1_syntax.lesson5_variables;

public class Variables {
    public static void main(String[] args) {
        byte byteNumber = 127;
        System.out.println("The byte number: " + byteNumber);

        short shortNumber = 32767;
        System.out.println("The short number: " + shortNumber);

        char charSymbol = 'a';
        System.out.println("The char variable: " + charSymbol);

        boolean booleanVariable = false;
        System.out.println("The boolean variable: " + booleanVariable);

        // casting - приведение типов
        //byteNumber = 127

        short varForCasting = byteNumber;
        System.out.println("After casting varForCasting: " + varForCasting);

        int intNumber = 5_000_000;
        short shortForCasting = (short) intNumber;
        System.out.println("After casting shortForCasting: " + shortForCasting);
    }
}
