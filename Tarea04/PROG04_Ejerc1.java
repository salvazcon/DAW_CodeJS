import java.util.Scanner;

/**
 * Autor --> Salvador Azcon. 
 * 
 * Descripcion: Programa que muestre los múltiplos de 5 
 * comprendidos entre dos números introducidos por teclado. 
 */
public class PROG04_Ejerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        System.out.println("Multiplos de 5 entre " + numero1 + " y " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
