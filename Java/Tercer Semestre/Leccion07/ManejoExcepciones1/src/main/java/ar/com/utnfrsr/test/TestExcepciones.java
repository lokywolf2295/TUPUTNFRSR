package ar.com.utnfrsr.test;

import static ar.com.utnfrsr.aritmetica.Aritmetica.division;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10,0); //Esto lanzará una ArithmeticException (división por cero) en la linea 5
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: ");
            e.printStackTrace(System.out); //Imprime el stack trace de la excepción (se conoce como la pila de excepciones)
            System.out.println(e.getMessage());
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}
