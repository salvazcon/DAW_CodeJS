/* 1. Programa que pida dos números del teclado, determine si el primero 
es múltiplo del segundo y visualice el resultado. */

import java.util.Scanner;
import java.util.InputMismatchException;

public class PROG02_Ejer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.print("Ingrese el primer numero: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar numeros enteros validos.");
            return;
        }
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es un multiplo de " + num2 + ".");
        } else {
            System.out.println(num1 + " no es un multiplo de " + num2 + ".");
        }
    }
}