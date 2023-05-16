package ar.co.utnfrsr.test;

import ar.co.utnfrsr.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("Gerente1 = "+gerente1.obtenerDetalles());
    }
}
