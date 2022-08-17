package clase_11;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        //Ejercicio 2: Determinar si un alumno aprueba i reprueba un curso, sabiendo que:
        //aprobará si su promedio de 3 calificaciones es mayor o igual a 70 sino reprueba
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la Primera Nota del Alumno: ");
        int nota_1 = leer.nextInt();
        System.out.print("Ingrese la Segunda Nota del Alumno: ");
        int nota_2 = leer.nextInt();
        System.out.print("Ingrese la Tercera Nota del Alumno: ");
        int nota_3 = leer.nextInt();
        
        double promedio =  (nota_1+nota_2+nota_3)/3;
        
        if (promedio >= 70){
            System.out.println("El alumno ha Aprobado con un promedio de: "+ promedio);
        }else {
            System.out.println("El alumno ha Desprobado con un promedio de: "+ promedio);
        }
        
        
    }

}
