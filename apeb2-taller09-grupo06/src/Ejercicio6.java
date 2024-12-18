
import java.util.Scanner;

/**
 * Analice el siguiente código Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark",
 * "Jennifer", "Alcides"}; String inicial; boolean bandera = true;
 * while(bandera){ System.out.println("Ingrese una letra"); inicial =
 * entrada.nextLine(); } Modifique el ciclo repetitivo para que salga del mismo,
 * cuando el usuario ingrese por teclado una letra que coincida con la primera
 * letra de los "nombres" contenidos en del arreglo estudiantes. Debe usar un
 * ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar de forma
 * constante dichas iniciales, imagine que estudiantes podría contener millón de
 * nombres, por lo que fijar iniciales, es ineficiente.
 *
 * @author David González/Dudef-ui
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides",};
        String inicial;
        boolean bandera = true;
        while (bandera == true) {
            System.out.print("Ingrese una letra: ");
            inicial = teclado.nextLine();
            for (String estudiante : estudiantes) {
                if (estudiante.startsWith(inicial)) { 
                    System.out.println("Coincidencia con: " + estudiante);
                }
                break;
            }
            bandera = false;
        }teclado.nextLine();
    }
}
/***
 * run:
 * Ingrese una letra: K
 * Coincidencia con: Kimberly
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */