/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaintroejerciciosextras;
import java.util.Scanner;
/**
 *
 * @author Carlos
*/

public class Extra06 {
 public static void main(String[] args){
     int altura, contadorGeneral, acumuladorGeneral, contadorBajo160,acumuladorBajo160;
     contadorGeneral=-1;
     acumuladorGeneral=0;
     contadorBajo160=-1;
     acumuladorBajo160=0;
     Scanner leer=new Scanner(System.in);
     do {
         System.out.println("Ingrese la altura de la persona No. "+(contadorGeneral+2));
         altura=leer.nextInt();
         contadorGeneral++;
         acumuladorGeneral+=altura;
         
         if (altura<160){
             contadorBajo160++;
             acumuladorBajo160+=altura;
         }
     }while(altura>0);
     
     if (contadorBajo160>0){
         System.out.println("El promedio de estaturas menores a 160cm es de: "+acumuladorBajo160/contadorBajo160);
     } else{
         System.out.println("No se ha ingresado ninguna estatura menor a 160cm");
     }
     System.out.println("El promedio general de estaturas es de: "+acumuladorGeneral/contadorGeneral);
 }  
}
