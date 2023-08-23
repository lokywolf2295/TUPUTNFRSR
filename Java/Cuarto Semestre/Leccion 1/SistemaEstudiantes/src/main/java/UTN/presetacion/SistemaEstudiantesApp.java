package UTN.presetacion;

import UTN.datos.EstudianteDAO;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;  //recueden esto ya lo hicimos
        var consola = new Scanner(System.in); //Para leer información del teclado
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del while
        var estudianteDao = new EstudianteDAO(); //Esta instancia debe hacerse una vez
        while (!salir){
            try{
                mostrarMenu();//Este será el método que nos devolverá un booleano
                salir = ejecutarOpciones(consola, estudianteDao); //Este método recibe la instancia de la clase servicio
            }catch (Exception e){
                System.out.println("Ocurrió un error al ejecutar la operación: " + e.getMessage());
            }
        }
    } //Fin metodo main
} //Fin clase