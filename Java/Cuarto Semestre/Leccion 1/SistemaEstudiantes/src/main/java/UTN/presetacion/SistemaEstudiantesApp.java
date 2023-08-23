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
                mostrarMenu(); //Mostramos el menú
                //Este será el método ejecutarOpciones que nos devolverá un booleano
                salir = ejecutarOpciones(consola, estudianteDao); //Este método recibe la instancia de la clase servicio
            }catch (Exception e){
                System.out.println("Ocurrió un error al ejecutar la operación: " + e.getMessage());
            }
        }//Fin while
    } //Fin metodo main

    //Método para mostrar el menú
    public static void mostrarMenu(){
        System.out.println("""
        ******* Sistema de Estudiantes *******
        1. Listar estudiantes
        2. Buscar estudiante
        3. Agregar estudiante
        4. Modificar estudiante
        5. Eliminar estudiante
        6. Salir
        Elija una opción:
        """);
    } //Fin metodo mostrarMenu

    //Método para ejecutar las opciones del menú, va a regresar un booleano, ya que es el que
    //puede modificar la variable salir, si es verdadero, el programa termina
    public static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDao) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        return salir;
    } //Fin metodo ejecutarOpciones
} //Fin clase