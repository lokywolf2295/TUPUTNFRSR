package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
public static void main(String[] args) {
        /*Ejercicio 4: Pedir números hasta que seteclee uno negativo. 
        Y mostrar cuántos números se han introducido.
        Hacerlo con la clase Scanner
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número: ");
        int numero, contador;
                
        numero = Integer.parseInt(leer.nextLine());
        contador = 0;
         while (numero >= 0) {
            contador ++;
            System.out.print("Ingrese un Número: ");
            numero = Integer.parseInt(leer.nextLine());
        }
        System.out.println("El programa a finalizado por número negativo");
        System.out.println("La Cantidad de números introducidos es: " + contador);
    }
}
