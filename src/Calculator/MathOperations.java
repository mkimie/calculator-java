package Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathOperations {

    public static BigDecimal calculate(int operator, BigDecimal num1, BigDecimal num2){
        BigDecimal result = new BigDecimal(0);
        if (operator == OperationsConstants.ADDICTION) {
            result = addition(num1, num2);
        } else if (operator == OperationsConstants.SUBTRACTION){
            result = subtraction(num1, num2);
        } else if(operator == OperationsConstants.MULTIPLICATION){
            result = multiplication(num1, num2);
        } else if(operator == OperationsConstants.DIVISION){
            result = division(num1, num2);
        }
        return  result;
    }

    private static BigDecimal addition(BigDecimal num1, BigDecimal num2){
        return num1.add(num2);
    }

    private static BigDecimal subtraction(BigDecimal num1, BigDecimal num2){
        return num1.subtract(num2);
    }

    private static BigDecimal multiplication(BigDecimal num1, BigDecimal num2){
        return num1.multiply(num2);
    }

    private static BigDecimal division(BigDecimal num1, BigDecimal num2){
        return num1.divide(num2, 2, RoundingMode.HALF_UP);
    }
}
