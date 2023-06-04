package ar.com.utnfrsr.aritmetica;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("No se puede dividir por cero");
        }
        return numerador / denominador;
    }
}
