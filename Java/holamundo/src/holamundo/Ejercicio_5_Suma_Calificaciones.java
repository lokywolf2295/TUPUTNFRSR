package holamundo;

import java.util.Scanner;

public class Ejercicio_5_Suma_Calificaciones {
    public static void main(String[] args) {
        
        //Ejercicio 5: Hacer un programa que calcule e imprima la suma de claificaciones.
        //Pedir las calificacioes al usuario.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite la primer calficación: ");
        float calif1 = Float.parseFloat(leer.nextLine());
        System.out.print("Digite la segunda calificación: ");
        float calif2 = Float.parseFloat(leer.nextLine());
        System.out.print("Digite la tercera calificación: ");
        float calif3 = Float.parseFloat(leer.nextLine());
        
        float califFinal = calif1+calif2+calif3;
        System.out.println("califFinal = " + califFinal);
        var promedio = califFinal/3;
        System.out.println("promedio = " + promedio);
    }
}
