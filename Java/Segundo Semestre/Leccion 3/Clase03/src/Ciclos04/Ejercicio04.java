package Ciclos04;

import javax.swing.JOptionPane;



public class Ejercicio04 {
public static void main(String[] args) {
        /*Ejercicio 4: Pedir números hasta que seteclee uno negativo. 
        Y mostrar cuántos números se han introducido.
        Hacerlo con la clase Scanner
        */
        
        int numero, contador;
                
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));
        contador = 0;
         while (numero >= 0) {
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));
        }
        System.out.println("El programa a finalizado por número negativo");
        JOptionPane.showMessageDialog(null,"La Cantidad de números introducidos es: " + contador);
    }
}
