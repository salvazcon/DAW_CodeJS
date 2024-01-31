import java.util.Scanner;

/**
 * Autor --> Salvador Azcon. 
 * 
 * Descripcion: Crear un programa en Java que calcula la
 * división de dos números solicitados por teclado. El
 * programa solicita números indefinidamente hasta que
 * ambos sean -1, controlando que el divisor no sea 0 y
 * mostrando el número de divisiones realizadas. Utiliza
 * excepciones para manejar errores.
 */
public class PROG04_Ejerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisionesCalculadas = 0;
        while (true) {
            System.out.print("Introduce el dividendo (o -1 para salir): ");
            int dividendo = scanner.nextInt();
            if (dividendo == -1) {
                break;
            }
            System.out.print("Introduce el divisor: ");
            int divisor = scanner.nextInt();
            try {
                int resultado = dividir(dividendo, divisor);
                System.out.println("Resultado de la division: " + resultado);
                divisionesCalculadas++;
            } catch (ArithmeticException e) {
                System.out.println("Error: No puedes dividir por 0. Intentalo de nuevo.");
            }
        }
        System.out.println("Numero total de divisiones calculadas: " + divisionesCalculadas);
    }

    /**
     * Realiza la operación de división entre dos números
     * enteros, controlando la división por 0.
     *
     * @param dividendo Número que se dividirá.
     * @param divisor Número por el cual se dividirá el dividendo.
     * @return Resultado de la división.
     * @throws ArithmeticException Si el divisor es 0, se lanza
     *  una excepción indicando "División por 0 no permitida".
     */
    private static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division por 0 no permitida");
        }
        return dividendo / divisor;
    }
}
