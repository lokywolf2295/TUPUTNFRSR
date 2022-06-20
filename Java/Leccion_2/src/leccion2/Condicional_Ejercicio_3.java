package leccion2;

import java.util.Scanner;

public class Condicional_Ejercicio_3 {

    public static void main(String[] args) {
        //Ejercicio 3 Condicionales: Calificaciones (If Else)
        Scanner leer = new Scanner(System.in);

        System.out.print("Digiite un número entre 0 y 10: ");
        var calificacion = Integer.parseInt(leer.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("La calificacion del Alumno es: A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("La calificacion del Alumno es: B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("La calificacion del Alumno es: C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("La calificacion del Alumno es: D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("La calificacion del Alumno es: E");
        }else{
            System.out.println("Fuera de Rango");
        }
    }
}
