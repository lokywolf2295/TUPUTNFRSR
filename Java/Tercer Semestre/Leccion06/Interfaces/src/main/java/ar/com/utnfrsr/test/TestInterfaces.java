package ar.com.utnfrsr.test;

import ar.com.utnfrsr.accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //IAccesoDatos datos = new IAccesoDatos(); //No se puede instanciar una interfaz
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        //imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
