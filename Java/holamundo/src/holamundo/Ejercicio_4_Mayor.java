package holamundo;

import java.util.Scanner;

public class Ejercicio_4_Mayor {
    public static void main(String[] args) {
        
        //Ejercicio 4: El mayor de 2 números
        
        //Usaremos el Operador Ternario
        //Levamos a perir los numeros al usuario
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numer1 = Integer.parseInt(leer.nextLine());
        System.out.print("Digite otro número: ");
        int numer2 = Integer.parseInt(leer.nextLine());
        
        var mayor = (numer1>numer2)? "Numero 1 es el mayor":"Numero 2 es el mayor"; //primero condición y luego decide la respuesta a dar
        System.out.println("El resultado de ambos numeros es = " + mayor);
        
    }
}
