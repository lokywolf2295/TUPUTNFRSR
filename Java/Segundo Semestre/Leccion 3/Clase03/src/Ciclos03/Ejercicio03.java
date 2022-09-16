package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        /*Ejercicio 3: Leer un número e indicar si es Par o Impar. 
        El proceso se repetirá  hasta que se introduzca un 0
        Realizarlo con la clase JOptionPane
        */

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));

        while (numero != 0) {
            if (numero %2 == 0) {
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es par");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Número"));
            } else {
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es impar");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Número"));
            }
        }
        JOptionPane.showMessageDialog(null, "El programa a finalizado por número cero");
    }
}
