
import java.util.Scanner;

/**
 * Con el objetivo practicar el uso del ciclo repetitivo for, se propone que dado un límite, 
 * se presenten las siguientes figuras. Por ejemplo si el límite es 4:
 * Figura 1:
 *    *
 *    **
 *    ***
 *    ****
 * @author David González / Dudef-ui
 */
public class Ejercicio1_figura1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim;
        System.out.println("Dime el nivel del arbol: ");
        lim = teclado.nextInt();
        for (int i = 1; i < lim; i++) {
            for (int j = 0; j < (i-1) ; j++) {
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
 * *
 * **
 * ***
 * BUILD SUCCESSFUL (total time: 2 seconds)
 */
    

