package ar.com.utnfrsr.domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) { //Constructor
        this.descripcion = descripcion;
    }

    //Metodo get (para acceder a la descripcion)
    public String getDescripcion() {
        return this.descripcion;
    }
}
