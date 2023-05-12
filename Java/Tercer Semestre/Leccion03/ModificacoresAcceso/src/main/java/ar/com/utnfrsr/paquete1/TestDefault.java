package ar.com.utnfrsr.paquete1;

public class TestDefault {
    public static void main(String[] args) {
        //Clase2 clase2 = new Clase2();
        ClaseHija2 claseHija2 = new ClaseHija2();
        claseHija2.atributoDefault = "Cambio desde la Prueba";
        System.out.println("Clase Hija atributo default = " + claseHija2.atributoDefault);
    }
}
