package ar.com.utnfrsr.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static { // Bloquede inicialización estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; // No se puede acceder a un atributo no estatico desde un contexto estatico
    }

    { // Bloque de inicialización no estatico (Contexto dinamico)
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++; //incrementamos el atributo contador para asignar a la persona actual
    }

    //Los bloques de inicialización se ejecutan antes del constructor de la clase
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + this.idPersona + '}';
    }
}
