/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package javaintroejerciciosextras;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Extra04 {
    public static void main(String[] args){
    int numero=0;
    
    Scanner leer=new Scanner(System.in);
    do {
       String romano="";
       System.out.println("Ingrese el número:");
       numero=leer.nextInt();
       if(numero>0 && numero<=3){
           for (int i=0;i<numero;i++){
               romano=romano+"I";
           }
       }
       if (numero==4){
           romano=romano+"IV";
       }
       if(numero>=5 && numero<=8){
           romano=romano+"V";
           if(numero!=5){
               for (int i=0;i<(numero-5);i++){
                   romano=romano+"I";
               }
           }
       }
       if (numero==9){
           romano=romano+"IX";
          } 
       if (numero==10){
           romano=romano+"X";
          } 
       
        System.out.println("El número "+numero+" en romano es: "+romano);
    } while(numero!=0);
    
        
    }
}
