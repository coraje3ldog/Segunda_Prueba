package main;

import java.util.Scanner;

import static aplicaciones.MenuOpciones.pintarMenu;

/** Clase Main donde se gestiona el menu de la calculadora
 * @author Luis Calzadilla / @LuisDavidCR
 * @version 0.1
 * @param leer cierre de Scanner consola;
 * @see aplicaciones.MenuOpciones
 * @see java.util.Scanner
 */

public class Main {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            opcion = pintarMenu();
            switch(opcion) {
                case 1:
                    System.out.println("Metodo Suma");
                    break;
                case 2:
                    System.out.println("Metodo Resta");
                    break;
                case 3:
                    System.out.println("Metodo Producto");
                    break;
                case 4:
                    System.out.println("Metodo Divición");
                    break;
            }


        }while(opcion != 5);

        System.out.println("FIN DE PROCESO");
        leer.close();
    }

}