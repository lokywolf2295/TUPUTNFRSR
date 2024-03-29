package ar.co.utnfrsr.test;

import ar.co.utnfrsr.domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        determinarTipo(empleado1);
     }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado; //casting convertimos la variable padre a una variable hija (Empleado a Gerente)
            //((Gerente) empleado).getDepartamento(); //otra forma de hacer el casting
            System.out.println("Gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente) empleado; //Arroja error en tiempo de ejecución
            //System.out.println("Gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
