package Calculator;

import java.math.BigDecimal;

public class Converter {
    static String resultConverter(int operator,
                                  BigDecimal num1,
                                  BigDecimal num2,
                                  BigDecimal result) {
        String op = operatorConverter(operator);
        return String.format("%s %s %s = %s", num1, op, num2, result);
    }

    static boolean isValidOperator(int operator) {
        return operator == 1
                || operator == 2
                || operator == 3
                || operator == 4;
    }
    private static String operatorConverter(int operator) {
        return switch (operator) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> null;
        };
    }

}
