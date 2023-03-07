/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Extra01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tiempo, dias, horas;
        System.out.println("Ingrese el tiempo en minutos: ");
        tiempo = leer.nextInt();
        dias=(int)(tiempo/1440);
        horas=(int)(tiempo-(dias*1440))/60;
        System.out.println(tiempo +" minutos equivalen a "+dias+" dias y "+horas+" horas");
    }
}
