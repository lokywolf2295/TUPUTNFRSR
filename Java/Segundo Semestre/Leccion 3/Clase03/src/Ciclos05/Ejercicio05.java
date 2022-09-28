package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void main(String[] args) {
        OUTER:
        while (true) {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "===========================\n"
                    + "|   JUEGO ADIVINA EL NÚMERO    |\n"
                    + "===========================\n"
                    + "1 - Nivel Facil\n"
                    + "2 - Nivel Intermedio \n"
                    + "3 - Nivel Dificil\n"
                    + "4 - Salir\n"
                    + "INGRESE UNA OPCIÓN: "));

            switch (opcion) {
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "CERRANDO EL JUEGO");
                    break OUTER;
                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN INCORRECTA\n");
                    break;
            }
        }
    }

    /**
     * <h2>Función Jugar</h2>
     *
     * Genera un numero random que debe ser adividano por el usuario para
     * adivinar ingresa numeros y luego verifica mediante condicionales si los
     * numeros son iguales o no
     *
     * @param vidas las vidas permiten al programa saber cuantas veces el
     * usuario podrá intentar adivinar el numero hasta ganar o no
     */
    static void jugar(int vidas) {
        int numeroRandom = (int) (Math.random() * 101);
        int numeroElegido = -1;

        while (numeroElegido != numeroRandom) {
            numeroElegido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y 100: "));

            if (numeroRandom < numeroElegido) {
                JOptionPane.showMessageDialog(null, "\n El Número pensado es mas pequeño");
                vidas--;
            } else if (numeroRandom > numeroElegido) {
                JOptionPane.showMessageDialog(null, "\n El Número pensado es mas grande");
                vidas--;
            }

            if (vidas == 0) {
                JOptionPane.showMessageDialog(null,
                        "\n======================================\n"
                        + "|              GAME OVER              |\n"
                        + "======================================\n");
                break;
            }
            JOptionPane.showMessageDialog(null,
                    "\n---------------------------------\n"
                    + "|   Te quedan  " + vidas + " vidas    |\n"
                    + "---------------------------------\n");
        }

        if (numeroElegido == numeroRandom) {
            JOptionPane.showMessageDialog(null,
                    "======================================\n"
                    + "|     FELICITACIONES GANASTE EL JUEGO     |\n"
                    + "======================================\n");
        }
    }
}
