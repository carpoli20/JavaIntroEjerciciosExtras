/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Extra10 {
    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   int n1, n2, respuesta;
   respuesta=0;
   n1= (int)(Math.random()*10)+1;
   n2= (int)(Math.random()*10)+1;
        System.out.print("Cuanto es "+n1+" x "+n2+" ?: ");
        do{
            respuesta=leer.nextInt();
            if(respuesta!=n1*n2){
                System.out.print("Respuesta incorrecta, intente de nuevo: ");
            } else{
                System.out.println("Respuesta correcta");
                
            }
        } while (respuesta!=n1*n2);
    }
}
