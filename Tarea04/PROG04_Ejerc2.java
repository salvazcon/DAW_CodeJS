import java.util.Scanner;

/**
 * Autor --> Salvador Azcon. 
 * 
 * Descripcion: Desarrollar un programa Java que solicita 5
 * números por teclado. Para cada número, verifica si es 
 * negativo y muestra un mensaje correspondiente. Si es 
 * positivo, determina si es primo y lo indica. El 
 * programa finaliza después de procesar los 5 números. 
 */
public class PROG04_Ejerc2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("El numero es primo.");
                } else {
                    System.out.println("El numero no es primo.");
                }
            }
        }
    }
}
