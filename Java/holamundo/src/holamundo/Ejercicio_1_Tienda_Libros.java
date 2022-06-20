package holamundo;

import java.util.Scanner;

public class Ejercicio_1_Tienda_Libros {

    /*
     * Ejercicio 1: Tienda de libros
        Mostrar: Ingrese los siguientes datos del libro
        Digite el nombre del libro
        Digite el ID del libro
        Digite el precio del libro
        Indicar si el envío es gratuito (True/False)
        Mostrar:
                Nombre:
                ID: 
                Precio:
                Envío Gratuito?:
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro:");
        System.out.print("Digite el nombre del libro: ");
        String nombre = leer.nextLine();
        System.out.print("Digite el id del libro: ");
        int id = Integer.parseInt(leer.nextLine());

        System.out.print("Digite el precio del libro: ");
        double precio = Double.parseDouble(leer.nextLine());

        System.out.print("Proporciona el envio gratis true / false: ");
        String envio = leer.nextLine();
        boolean envioGratis = true;

        System.out.println("Nombre:" + nombre);
        System.out.println("ID:" + id);
        System.out.println("precio $:" + precio);
        if (envio == "true" || envio == "TRUE" || envio == "true") {
            envioGratis = true;
            System.out.println("Envio gratuito ");
        } else
            envioGratis = false;
            System.out.println("El envío se paga con anticipación");
        }
}
