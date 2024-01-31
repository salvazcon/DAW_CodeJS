import java.util.Scanner;

/**
 * Autor --> Salvador Azcon. 
 * 
 * Descripcion: Implementar un juego en Java que permite al
 * usuario adivinar un número oculto. Presenta un menú con
 * opciones para configurar o jugar. Si elige jugar sin 
 * configurar, se usan valores predeterminados. Proporciona
 * pistas y muestra mensajes según los intentos y resultados.
 */
public class PROG04_Ejerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInt = 5;
        int numMax = 10;

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Configurar");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el numero de intentos permitidos: ");
                    numInt = scanner.nextInt();
                    System.out.print("Introduce el numero maximo generado: ");
                    numMax = scanner.nextInt();
                    break;
              
                case 2:
                    int numOculto = (int) Math.floor(Math.random() * numMax + 1);
                    jugar(numOculto, numInt);
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        }
    }

    /**
     * Permite al usuario jugar a adivinar un número oculto 
     * generando mensajes según sus intentos.
     *
     * @param numOculto Número oculto que el usuario debe adivinar.
     * @param numInt Número de intentos permitidos.
     */
    private static void jugar(int numOculto, int numInt) {
        Scanner scanner = new Scanner(System.in);

        for (int intento = 1; intento <= numInt; intento++) {
            System.out.print("Intento " + intento + ": Introduce tu numero: ");
            int numUsuario = scanner.nextInt();

            if (numUsuario == numOculto) {
                System.out.println("¡Has ganado! Has necesitado " + intento + " intentos.");
                break;
            } else {
                if (numUsuario < numOculto) {
                    System.out.println("El numero oculto es mayor.");
                } else {
                    System.out.println("El numero oculto es menor.");
                }

                if (intento == numInt) {
                    System.out.println("Perdiste. Se han consumido todos los intentos. El numero oculto era " + numOculto + ".");
                }
            }
        }
    }
}
