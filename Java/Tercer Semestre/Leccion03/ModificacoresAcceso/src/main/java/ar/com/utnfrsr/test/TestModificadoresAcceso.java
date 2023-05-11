package ar.com.utnfrsr.test;

import ar.com.utnfrsr.paquete1.Clase1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        clase1.metodoPublico();
    }
}
