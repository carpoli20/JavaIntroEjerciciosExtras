/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Extra11 {
    public static void main(String[] args) {
        int n, digitos;
        digitos=0;
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n=leer.nextInt();
        do{
            n=n/10;
            digitos++;
        }while((int)(n)>0);
        System.out.println("El número ingresado tiene "+digitos+" dígitos");
    }
}
