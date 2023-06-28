package Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathOperations {

    /**
     * Método que executa uma operação matemática entre dois números
     * conforme os parâmetros recebidos.
     * @param operator int - Operador
     * @param num1 BigDecimal - Termo
     * @param num2 BigDecimal - Termo
     * @return Bigdecimal - Resultado
     **/
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

    /**
     * Método que realiza a operação de soma entre dois números.
     * @param num1 BigDecimal - Parcela
     * @param num2 BigDecimal - Parcela
     * @return Bigdecimal - Total
     **/
    private static BigDecimal addition(BigDecimal num1, BigDecimal num2){
        return num1.add(num2);
    }

    /**
     * Método que realiza a operação de subtração entre dois números.
     * @param num1 BigDecimal - Minuendo
     * @param num2 BigDecimal - Subtraendo
     * @return Bigdecimal - Diferença
     **/
    private static BigDecimal subtraction(BigDecimal num1, BigDecimal num2){
        return num1.subtract(num2);
    }

    /**
     * Método que realiza a operação de multiplicação entre dois números.
     * @param num1 BigDecimal - Multiplicando
     * @param num2 BigDecimal - Multiplicador
     * @return Bigdecimal - Produto
     **/
    private static BigDecimal multiplication(BigDecimal num1, BigDecimal num2){
        return num1.multiply(num2);
    }

    /**
     * Método que realiza a operação de divisão entre dois números.
     * @param num1 BigDecimal - Dividendo
     * @param num2 BigDecimal - Divisor
     * @return Bigdecimal - Quociente
     **/
    private static BigDecimal division(BigDecimal num1, BigDecimal num2){
        return num1.divide(num2, 2, RoundingMode.HALF_UP);
    }
}
