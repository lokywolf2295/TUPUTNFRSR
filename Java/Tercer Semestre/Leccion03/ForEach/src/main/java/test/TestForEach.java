package test;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = { 5, 6, 8, 9, 10, 11, 12, 13, 14, 15 }; // sintaxis de inicializacion de un arreglo resumida
        for (int edad : edades) { //Sintaxis del ForEach
            System.out.println(edad);
        }
    }
}
