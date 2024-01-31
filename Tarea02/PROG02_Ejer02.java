/* 2. Programa que cree un tipo enumerado para los meses del año. 
El programa debe realizar las siguientes operaciones:

- Crear una variable m del tipo enumerado y asignarle el mes de "MARZO".
Mostrar por pantalla su valor.

- Asignar a la variable m la cadena de texto "ABRIL" y mostrar por la 
pantalla el valor de la variable tras realizar la asignación. */

public class PROG02_Ejer02 {
    enum Mes{ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE};
    public static void main(String[] args) {
        Mes m = Mes.MARZO;
        System.out.println("El valor de m es: " + m);

        m = Mes.ABRIL;
        System.out.println("El valor de m es: " + m);
    }
}