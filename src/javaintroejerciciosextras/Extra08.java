/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaintroejerciciosextras;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Extra08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       double n;
        int pares, impares;
       pares=0;
       impares=0;
        
        do {
            System.out.print("Ingrese el siguiente número: ");
            n=leer.nextInt();
            if (n<0){
                continue;
            }
            if(n/5-(int)(n/5)==0){
                break;
            }
            if (n%2==0){
                pares++;
            } else{
                impares++;
            }
        } while(true);
        System.out.println("El total de números pares es: "+pares);
        System.out.println("El total de números impares es: "+impares);
        System.out.println("El total de números ingresados es: "+(pares+impares));
    }
}
