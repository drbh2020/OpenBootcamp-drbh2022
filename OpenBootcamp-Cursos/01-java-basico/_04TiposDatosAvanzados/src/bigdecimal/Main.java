package bigdecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);

        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);
//        valorA.multiply(valorB);

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado);
    }
}
