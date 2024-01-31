/* 3. Programa que lea del teclado un número n y visualice los primeros 
n términos de la serie de Fibonacci. Los primeros elementos son: 0, 1, 1, 
2, 3, 5, 8, 13, 21, ... */

import java.util.Scanner;
import java.util.InputMismatchException;

public class PROG02_Ejer03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        try {
            System.out.print("Ingresa un numero: ");
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar numeros enteros validos.");
            return;
        }
        if (num < 0) {
            System.out.println("Error: Por favor, ingrese un numero positivo.");
        } else {
            System.out.println("Los primeros " + num + " terminos de la serie de Fibonacci son:");
            for (int i = 0; i < num; i++)
                System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
	    if (n < 2)
		    return (n);
	    return ((fibonacci(n - 1) + fibonacci(n - 2)));
    }
    
}

