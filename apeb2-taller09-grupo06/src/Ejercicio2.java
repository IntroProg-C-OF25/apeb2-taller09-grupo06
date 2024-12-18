
import java.util.Scanner;

/**
 * Ejercicio 2 Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim, a = 0, b = 1, c = 0;
        int cant = 10, cont = 0, num = 2, i = 2;
        System.out.print("Dime cuantos numeros quieres visualizar: ");
        lim = teclado.nextInt();
        int[] fibo = new int[lim];
        for (i = 0; i < lim; i++) {
            //CADENA FIBO
            a = b;
            b = c;
            c = a + b;
            fibo[i] = c;
        }
        //DETERMINAR SI UN NUMERO ES PRIMO O NO
        int[] primos = new int[lim];
        while (cont < cant) {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(num)) {
                primos[cont] = num;
                cont++;
            }
            num++;
        }
        for ( i = 0; i < lim; i++) {
            System.out.print(fibo[i]+"/"+primos[i] + " ");
        }
    }
}
/***
 * run:
 * Dime cuantos numeros quieres visualizar: 10
 * 1/2 1/3 2/5 3/7 5/11 8/13 13/17 21/19 34/23 55/29 BUILD SUCCESSFUL (total time: 3 seconds)
 */