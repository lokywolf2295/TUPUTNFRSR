package leccion2;

import java.util.Scanner;

public class Condicional_Ejercicio_4 {

    public static void main(String[] args) {
        //Ejercicio 4 Condicionales: Calificaciones (Switch)
        Scanner leer = new Scanner(System.in);

        System.out.print("Digiite un número entre 0 y 10: ");
        var calificacion = Integer.parseInt(leer.nextLine());

        switch (calificacion) {
            case 10: case 9:
                System.out.println("La calificacion del Alumno es: A");
                break;
            case 8:
                System.out.println("La calificacion del Alumno es: B");
                break;
            case 7:
                System.out.println("La calificacion del Alumno es: C");
                break;
            case 6:
                System.out.println("La calificacion del Alumno es: D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("La calificacion del Alumno es: E");
                break;
            default:
                System.out.println("Fuera de Rango");
                break;
        }
        

    }
}
