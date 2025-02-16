package aplicaciones;

import java.util.Scanner;

/** Clase para mostrar el menu en consola
 * @author Luis Calzadilla / @LuisDavidCR
 * @version 0.1
 */

public class MenuOpciones {

    private static Scanner leer = new Scanner(System.in);

    /** Método para gestinar el Menu Principal
     * @param opcion - tipo int, inicia a 0.
     * @return opcion --  valor recivido.
     */
    public static int pintarMenu() {
        int opcion = 0;

        System.out.println("\n************ACTIVIDAD CALCULADORA************\n");
        System.out.println("1.- Operaciones Suma");
        System.out.println("2.- Operaciones Resta");
        System.out.println("3.- Operaciones Producto");
        System.out.println("4.- Operaciones Divicion");
        System.out.println("5.- Salir\n");

        System.out.println("Teclea una opcion, 5 para salir");

        while(true) {
            if (leer.hasNextInt()) {   /// Verifica que valor ingresado sea un numero entero
                opcion = leer.nextInt();
                if (opcion < 1 || opcion > 5) { ///Fuera de Rango de valores
                    System.out.println("Opcion incorrecta, validos del 1 al 4");
                }
                else
                    break;
            }
            else {
                System.out.println("Opcion incorrecta, solo debes ingresar numeros enteros.");
                leer.next(); /// si no es un valor entero descarta la salida
            }
        }


        return opcion;
    }

}
