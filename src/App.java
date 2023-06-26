import Calculator.Calculator;

public class App {
    public static void main(String[] args) {

        try {
            System.out.println(Calculator.execute());
            Calculator.restart();
        } catch (RuntimeException ex) {
            System.out.printf("Error executing operation : %s%n", ex);
        }
    }
}