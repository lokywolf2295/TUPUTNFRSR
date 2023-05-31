package ar.com.utnfrsr.test;

import ar.com.utnfrsr.domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //1. Creacion de un objeto de la clase Empleado
        Empleado empleado;
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        //System.out.println("empleado = " + empleado.obtenerDetalles()); //Si queremos acceder a un metodo de la clase hija, debemos convertir el objeto a la clase hija
        //empleado.getTipoEscritura(); //No se puede acceder a este metodo porque no esta definido en la clase padre

        //2. Convertir objeto Escritor en tipo Empleado
        //Downcasting
        //((Escritor) empleado).getTipoEscritura(); //Se puede acceder a este metodo porque convertimos el objeto a la clase hija (Escritor
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        }
}
