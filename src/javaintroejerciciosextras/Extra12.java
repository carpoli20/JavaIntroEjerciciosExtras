/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
 */
package javaintroejerciciosextras;

/**
 *
 * @author cjalil
 */
public class Extra12 {

    public static void main(String[] args) {
        
        String digito1, digito2, digito3;
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                digito1 = "E";
            } else {
                digito1 = i + "";
            }
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    digito2 = "E";
                } else {
                    digito2 = j + "";
                }
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        digito3 = "E";
                    } else {
                        digito3 = k + "";
                    }
                  
                    System.out.println(digito1+"-"+digito2+"-"+digito3);
                    
                }
            }
        }
    }
}
