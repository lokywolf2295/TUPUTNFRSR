package holamundo;

import java.util.Scanner;

public class Ejercicio_6_Dolares {
    public static void main(String[] args) {
       //Ejercicio 6: Guillermo tiene N Dolares. Luis tiene la mitad de dolares que posee Guillermo
       //Juan tiene la mitad de lo que poseen Luis y Guillermo Juntos.
       //Hacer un programa que alcule e imprima la cantidad de dinero que tienen entre los tres.
       
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese la cantidad de dolares que tiene Gillermo: ");
        float guillermo = Float.parseFloat(leer.nextLine());
        var luis = guillermo/2;
        var juan = (guillermo + luis)/2;
        
        System.out.println("Guillermo Tiene: $" + guillermo);
        System.out.println("Luis Tiene: $" + luis);
        System.out.println("Juan Tiene: $" + juan);
    }
}
