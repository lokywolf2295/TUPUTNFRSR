package ar.com.utnfrsr.test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 10/0; //Esto lanzará una ArithmeticException (división por cero) en la linea 5
        System.out.println(resultado);
    }
}
