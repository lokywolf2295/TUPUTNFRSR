package ar.com.utnfrsr.test;

import ar.com.utnfrsr.excepciones.OperacionExcepcion;

import static ar.com.utnfrsr.aritmetica.Aritmetica.division;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10,2); //Esto lanzará una ArithmeticException (división por cero) en la linea 5
        } catch (OperacionExcepcion e) { //las excepciones se colocan de la más específica a la más general (de menor a mayor jerarquía)
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrió una excepción: ");
            e.printStackTrace(System.out); //Imprime el stack trace de la excepción (se conoce como la pila de excepciones)
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}
