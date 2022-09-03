package Ciclos02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos02 {

    public static void main(String[] args) {
        /*Ejercicio 2: Leer un número e indicar si es Positivo o Negativo. 
        El proceso se repetirá  hasta que se introduzca un 0*/
         Scanner leer = new Scanner(System.in);
         
        int numero;
        System.out.print("Ingrese un Número: ");
        numero = Integer.parseInt(leer.nextLine());

        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número: " + numero + " es positivo");
                System.out.print("Ingrese un Número: ");
                numero = Integer.parseInt(leer.nextLine());
            } else {
                System.out.println("El número: " + numero + " es negativo");
                System.out.print("Ingrese otro Número: ");
                numero = Integer.parseInt(leer.nextLine());
            }
        }
        System.out.println("El programa a finalizado por número cero");
    }
}
