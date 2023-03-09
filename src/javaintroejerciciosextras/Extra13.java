/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Extra13 {
    public static void main(String[] args) {
        int altura;
        String cadena="";
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        altura=leer.nextInt();
        for (int i=1;i<=altura;i++){
            cadena+=(i);
            System.out.println(cadena);
        }
    }
}
