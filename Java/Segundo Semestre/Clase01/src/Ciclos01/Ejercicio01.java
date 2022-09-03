package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*Ejercicio 1: Leer un número y mostrar su cuadrado, 
        repetir el proceso hasta que se introduzca un número negativo*/

        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2); //permite elevarun número a la potencia indicada en la 2da variable (2)
            System.out.println("El cuadrado de " + numero + " es = " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Número"));
        }
        System.out.println("El programa a finalizado por numero negativo");
    }
}
