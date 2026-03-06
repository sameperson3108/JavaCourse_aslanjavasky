package mod1_syntax.lesson23_BigDecimal_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {
    static void main() {

        //BigDecimal
        BigDecimal number1 = new BigDecimal("12321321321.232323123");
        BigDecimal number2 = BigDecimal.valueOf(12321321321.232323123);
        BigDecimal sum = number1.add(number2); // number1 + number 2
        BigDecimal tax = sum.multiply(new BigDecimal("0.13")); // 13 процентов

        System.out.println("Total salary " + sum);
        System.out.println("Tax " + tax);

        //BigInteger
        BigInteger number3 = new BigInteger("21231232145753743455");
        BigInteger number4 = BigInteger.valueOf(2342342343423423L);

        BigInteger dif = number3.subtract(number4); //разница

        System.out.println(dif);
    }
}
