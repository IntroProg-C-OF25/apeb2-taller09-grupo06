/***
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número de 
 * elementos que el usuario lo disponga. Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * @author Luis
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int i = 0, lim = 0;
        String condicion;
        System.out.print("Escriba la cantidad de elementos que va a ingresar: ");
        lim = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[lim];
        for (i = 0; i < lim;) {
            System.out.print("Ingrese la marca de un vehículo: ");
            condicion = tcl.nextLine();
            if (condicion.length() > 0) {
                char primeraLetra = condicion.charAt(0); 
                if (primeraLetra == 'A' || primeraLetra == 'a' || primeraLetra == 'C' || primeraLetra == 'c' || primeraLetra == 'T' || primeraLetra == 't') {
                    System.out.println("Esta marca no es permitida (marcas que empiezen con A, C o T)");
                } else {
                    marcas[i] = condicion;
                    i++;  
                }
            }
        }
        System.out.println("\nMarcas de vehículos ingresadas:");
        for (int j = 0; j < lim; j++) {
            System.out.println(marcas[j]);
        }
    }
}
/***
 * Escriba la cantidad de elementos que va a ingresar: 8
 * Ingrese la marca de un vehículo: Audi 
 * Esta marca no es permitida (marcas que empiezen con A, C o T)
 * Ingrese la marca de un vehículo: BMW
 * Ingrese la marca de un vehículo: Ford
 * Ingrese la marca de un vehículo: Mercedes
 * Ingrese la marca de un vehículo: Toyota
 * Esta marca no es permitida (marcas que empiezen con A, C o T)
 * Ingrese la marca de un vehículo: Ferrari
 * Ingrese la marca de un vehículo: Mclaren 
 * Ingrese la marca de un vehículo: Mitsubishi
 * Ingrese la marca de un vehículo: Chevrolet
 * Esta marca no es permitida (marcas que empiezen con A, C o T)
 * Ingrese la marca de un vehículo: KIA
 * Ingrese la marca de un vehículo: Subaru

 * Marcas de vehículos ingresadas:
 * BMW
 * Ford
 * Mercedes
 * Ferrari
 * Mclaren 
 * Mitsubishi
 * KIA
 * Subaru
 */    