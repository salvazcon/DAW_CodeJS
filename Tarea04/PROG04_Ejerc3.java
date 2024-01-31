import java.util.Scanner;

/**
 * Autor --> Salvador Azcon. 
 * 
 * Descripcion: Crear un programa en Java que pide dos 
 * números positivos por teclado, verifica su positividad
 * y calcula el Mínimo Común Múltiplo (MCM). Si alguno no
 * es positivo, muestra un mensaje y finaliza.
 */
public class PROG04_Ejerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Ambos numeros deben ser positivos. El programa ha finalizado.");
        } else {
            int mcm = calcularMCM(num1, num2);
            System.out.println("El Minimo Comun Multiplo de " + num1 + " y " + num2 + " es: " + mcm);
        }
	}
	
    /**
     * Calcula el Mínimo Común Múltiplo (MCM) de dos números utilizando
     * su Máximo Común Divisor (MCD).
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return El MCM de los dos números proporcionados.
     */
	private static int calcularMCM(int a, int b) {
	    return (a * b) / calcularMCD(a, b);
	}
	
    /**
     * Calcula el Máximo Común Divisor (MCD) de dos números utilizando 
     * el algoritmo de Euclides.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return El MCD de los dos números proporcionados.
     */
	private static int calcularMCD(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
}
