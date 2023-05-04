package ar.com.utnfrsr;

public class Main {
    public static void main(String[] args) {

    }

    private static void imprimirNumeros(int ...numeros){//los tres puntos representan argumentos variables.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}