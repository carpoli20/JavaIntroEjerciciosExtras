/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package javaintroejerciciosextras;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Extra07 {
    public static void main(String[] args){
        int n, maximo, minimo, suma, contador;
        contador=0;
        minimo=2147483647;
        maximo=0;
        suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        n=leer.nextInt();
        while (contador<n) {
            int numero;
            System.out.print("Número "+(contador+1)+" :");
            numero=leer.nextInt();
            contador++;
            suma+=numero;
            if (numero>maximo){
                maximo=numero;
            }
            if (numero<minimo){
                minimo=numero;
            }
        } 
        System.out.println("El número máximo es: "+maximo);
        System.out.println("El número mínimo es: "+minimo);
        System.out.println("El promedio es: "+suma/n);
    }
}
