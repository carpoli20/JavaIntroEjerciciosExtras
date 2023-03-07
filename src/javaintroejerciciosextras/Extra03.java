/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Extra03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra = "";

        do {
            System.out.println("Ingrese la letra: ");
            letra = leer.next();
            if (letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
                System.out.println("La letra ingresada es una vocal");
            } else {
                System.out.println("La letra ingresado NO es una vocal");
            }
        } while (!letra.equals("0"));
    }
}
