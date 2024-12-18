/** *
 * Ejercicio 4
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author David González/Dudef-ui
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int i, media_aritmetica = 0, arriba_media = 0, abajo_media = 0;
        for (i = 0; i < arreglo.length; i++) {
            media_aritmetica = media_aritmetica + arreglo[i];
        }
        media_aritmetica = media_aritmetica / arreglo.length;
        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] <= media_aritmetica) {
                abajo_media++;
            } else {
                arriba_media++;
            }
        }
        System.out.print("Valores por encima de la media: " + arriba_media + "\n");
        System.out.print("Valores debajo de la media: " + abajo_media);
        System.out.println("");
    }
}
/***
 * run:
 * Valores por encima de la media: 8
 * Valores debajo de la media: 5
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */