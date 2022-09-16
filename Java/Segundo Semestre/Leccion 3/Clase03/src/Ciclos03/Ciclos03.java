/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {

    public static void main(String[] args) {
        /*Ejercicio 3: Leer un número e indicar si es Par o Impar. 
        El proceso se repetirá  hasta que se introduzca un 0
        Hacerlo con la clase Scanner
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número: ");
        int numero = Integer.parseInt(leer.nextLine());

         while (numero != 0) {
            if (numero %2 == 0) {
                System.out.println("El número: " + numero + " es par");
                System.out.print("Ingrese un Número: ");
                numero = Integer.parseInt(leer.nextLine());
            } else {
                System.out.println("El número: " + numero + " es impar");
                System.out.print("Ingrese otro Número: ");
                numero = Integer.parseInt(leer.nextLine());
            }
        }
        System.out.println("El programa a finalizado por número cero");
    }

}
