
import java.util.Scanner;

/**
 * Figura 2:
 * 
 *     *
 *    ***
 *   *****
 *  *******
 * @author David González/Dudef-ui
 */
public class Ejercicio1_figura2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim;
        System.out.println("Dime el nivel del arbol: ");
        lim = teclado.nextInt();
        for (int i = 1; i < lim; i++) {
            for (int k = 0; k < (lim - i); k++) {
                System.out.print(" ");                  
                }
            for (int j = 0; j < ((i*2)-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
/***
 * run:
 * Dime el nivel del arbol: 
 * 5
 *    *
 *   ***
 *  *****
 * *******
 *
 * BUILD SUCCESSFUL (total time: 8 seconds)
 */
   
