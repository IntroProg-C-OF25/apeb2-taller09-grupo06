/***
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas 
 * en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 * @author Luis
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int lim = 29, aprobados = 0, reprobados = 0, mejor = 0, peor = 0;
        double sumatoriaNotas = 0, promedio = 0;
        double estudiante[] = new double[lim], peorNota = 10, mejorNota = 0;
        for (int i = 1; i < estudiante.length; i++) {
            estudiante[i] = Math.random()*10;
        }
        for (int i = 1; i < estudiante.length; i++) {
            sumatoriaNotas += estudiante[i]; 
        }
        promedio = sumatoriaNotas / estudiante.length;
        System.out.println("El promedio del paralelo C es = " + promedio);
        System.out.println("\n*Estudiantes con nota por encima del promedio: \n");
        for (int i = 1; i < estudiante.length; i++) {
            if (estudiante[i] > promedio) {
                System.out.println("Estudiante " + (i + 1) + ": " + estudiante[i]);
            }
        }
        
        System.out.println("\n*Estudiantes con nota por debajo del promedio: \n");
        for (int i = 1; i < estudiante.length; i++) {
            if (estudiante[i] < promedio) {
                System.out.println("Estudiante " + (i + 1) + ": " + estudiante[i]);
            }
        }
        for (int i = 1; i < estudiante.length; i++) {
            if (estudiante[i] > mejorNota){
                mejorNota = estudiante[i];
                mejor = i;
            } else if (estudiante[i] < peorNota){
                   peorNota = estudiante[i];
                   peor = i;
            }
        }
        System.out.println("\nEl estudiante " + mejor + " tiene la mejor calificacion con: " + mejorNota);
        System.out.println("El estudiante " + peor + " tiene la calificacion mas baja con: " + peorNota);
    }
}
/***
 * El promedio del paralelo C es = 6.040236813275552
 **Estudiantes con nota por encima del promedio: 
 * Estudiante 3: 6.7107456682983155
 * Estudiante 4: 8.31595868182432
 * Estudiante 8: 8.339521448674448
 * Estudiante 9: 8.299985454448779
 * Estudiante 12: 8.556242334597151
 * Estudiante 16: 9.881726295377154
 * Estudiante 18: 6.356791036251809
 * Estudiante 20: 8.860063878177375
 * Estudiante 22: 9.37504931009558
 * Estudiante 24: 8.180283528717023
 * Estudiante 25: 7.478973789787168
 * Estudiante 27: 9.052238966182811
 * Estudiante 28: 6.52004988822461
 * Estudiante 29: 7.649160960039466

 **Estudiantes con nota por debajo del promedio: 

 * Estudiante 2: 3.046543143132091
 * Estudiante 5: 4.210843867621817
 * Estudiante 6: 3.007316461484244
 * Estudiante 7: 4.983360681631033
 * Estudiante 10: 2.285670316079634
 * Estudiante 11: 5.6410521326692304
 * Estudiante 13: 1.5838424903750736
 * Estudiante 14: 5.707925479607892
 * Estudiante 15: 5.445185465138592
 * Estudiante 17: 5.903557979173292
 * Estudiante 19: 5.4276849347757405
 * Estudiante 21: 4.949817303799069
 * Estudiante 23: 4.586583129788531
 * Estudiante 26: 4.810692959018775

 * El estudiante 15 tiene la mejor calificacion con: 9.881726295377154
 * El estudiante 12 tiene la calificacion mas baja con: 1.5838424903750736
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */