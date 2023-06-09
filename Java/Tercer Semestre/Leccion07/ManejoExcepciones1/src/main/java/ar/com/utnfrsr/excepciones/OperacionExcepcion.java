package ar.com.utnfrsr.excepciones;

public class OperacionExcepcion extends RuntimeException{
    //Constructor
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
