package ar.com.utnfrsr.aritmetica;

import ar.com.utnfrsr.excepciones.OperacionExcepcion;
public class Aritmetica {
    public static int division(int numerador, int denominador)
            throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("No se puede dividir por cero");
        }
        return numerador / denominador;
    }
}
