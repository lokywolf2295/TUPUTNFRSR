package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {

    public static void main(String[] args) {
        /*Ejercicio 1: Leer un número y mostrar su cuadrado, 
        repetir el proceso hasta que se introduzca un número negativo*/

        Scanner leer = new Scanner(System.in);
        int numero, cuadrado;
        numero = 0;

        while (numero >= 0) {
            System.out.print("Ingrese un Número: ");
            numero = Integer.parseInt(leer.nextLine());
            if (numero >= 0) {
                cuadrado = (int)Math.pow(numero, 2); //permite elevarun número a la potencia indicada en la 2da variable (2)
                System.out.println("El cuadrado de " + numero + " es = " + cuadrado);
            }else{
                System.out.println("El programa a finalizado por numero negativo");
            }
        }
    }
}
