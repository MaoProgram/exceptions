import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) throws NumericInput {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el costo de la prenda ");

        try {
            int number = scanner.nextInt();
        } catch (InputMismatchException exception) {
            exception.printStackTrace(System.out);
            throw new NumericInput();
        }
    }
}