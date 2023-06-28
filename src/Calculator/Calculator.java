package Calculator;

import java.math.BigDecimal;
import java.util.Scanner;

import static Calculator.Converter.*;

public class Calculator {

    /**
     * Método que realiza a inicialização da Calculadora
     **/
    public static void init() {
        try {
            System.out.println(Calculator.execute());
            Calculator.restart();
        } catch (RuntimeException ex) {
            System.out.printf("Error executing operation : %s%n", ex);
        }
    }

    /**
     * Método que realiza a execução da Calculadora
     **/
    public static String execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation:\n" +
                "1- ADDITION\n" +
                "2- SUBTRACTION\n" +
                "3- MULTIPLICATION\n" +
                "4- DIVISION\n ");
        int operator = sc.nextInt();

        if (!isValidOperator(operator)) {
            return "Invalid Operation!";
        } else {
            System.out.println("Enter the first number:");
            BigDecimal num1 = sc.nextBigDecimal();

            System.out.println("Enter the second number:");
            BigDecimal num2 = sc.nextBigDecimal();

            BigDecimal result = MathOperations.calculate(operator, num1, num2);
            return resultConverter(operator, num1, num2, result);
        }
    }

    /**
     * Método que realiza a reinicialização da Calculadora
     **/
    public static void restart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option:\n" +
                "0- EXIT\n" +
                "1- CONTINUE");
        boolean isContinue = sc.nextInt() == 1;
        while (isContinue) {
            System.out.println(execute());
            restart();
            break;
        }
    }

}
