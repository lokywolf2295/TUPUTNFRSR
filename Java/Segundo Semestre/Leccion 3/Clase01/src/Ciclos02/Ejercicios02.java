package Ciclos02;

import javax.swing.JOptionPane;

public class Ejercicios02 {

    public static void main(String[] args) {
        /*Ejercicio 2: Leer un número e indicar si es Positivo o Negativo. 
        El proceso se repetirá  hasta que se introduzca un 0*/

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));

        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es positivo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Número"));
            }else{
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Número"));
            }
        }
         JOptionPane.showMessageDialog(null,"El programa a finalizado por número cero");
    }
}
