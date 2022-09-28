package Ciclos05;

import javax.swing.JOptionPane;

public class Programa_19 {

    public static void main(String[] args) {

        String respuesta = JOptionPane.showInputDialog("Salúdame por favor ");
        respuesta = respuesta.toLowerCase();

        if (respuesta.equals("hola")) {

            JOptionPane.showMessageDialog(null, "¿Como estas ?");

        } else {

            JOptionPane.showMessageDialog(null, "No te entiendo ");

        }
    }
}