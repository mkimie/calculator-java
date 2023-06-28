package Calculator;

import java.math.BigDecimal;

public class Converter {

    /**
     * Método que realiza a conversão do resultado das operações
     * em String para retorno em tela.
     * @param operator int - Operador
     * @param num1 BigDecimal - Termo
     * @param num2 BigDecimal - Termo
     * @param result BigDecimal - Resultado
     * @return String - Operação Matemática covertida em String
     **/
    public static String resultConverter(int operator,
                                  BigDecimal num1,
                                  BigDecimal num2,
                                  BigDecimal result) {
        String op = operatorConverter(operator);
        return String.format("%s %s %s = %s", num1, op, num2, result);
    }

    /**
     * Método que realiza a conversão das opções numéricas em operador matemático.
     * @param operator int - Operador
     * @return String - Operador convertido em caracter
     **/
    private static String operatorConverter(int operator) {
        return switch (operator) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> null;
        };
    }

    /**
     * Método que valida as opções digitadas para operação.
     * @param operator int - Operador
     * @return boolean - True se opção válida
     **/
    protected static boolean isValidOperator(int operator) {
        return operator == 1
                || operator == 2
                || operator == 3
                || operator == 4;
    }

}
