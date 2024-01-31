/* 4. Programa que calcule y visualice la tabla de sumar y 
multiplicar de un número introducido por teclado. */

import java.util.Scanner;
import java.util.InputMismatchException;

public class PROG02_Ejer04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;

        try {
            System.out.print("Ingresa un numero: ");
            num = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar numeros.");
            return;
        }

        System.out.println("Tabla de Suma para " + num + ":");
        for (int i = 1; i <= 10; i++) {
            double suma = num + i;
            System.out.println(num + " + " + i + " = " + suma);
        }

        System.out.println("Tabla de Multiplicacion para " + num + ":");
        for (int i = 1; i <= 10; i++) {
            double multiplicacion = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacion);
        }
    }
}