package ar.com.utnfrsr.test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        //try {
            resultado = 10/0; //Esto lanzará una ArithmeticException (división por cero) en la linea 5
        //} catch (ArithmeticException e) {
        //    System.out.println("Ocurrió una excepción: ");
        //    e.printStackTrace(System.out); //Imprime el stack trace de la excepción (se conoce como la pila de excepciones)
        //}
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}
