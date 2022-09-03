package leccion2;

import java.util.Scanner;

public class Leccion_2 {

    public static void main(String[] args) {
        
        //Condicionales If y Else
        /*
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion Verdadera");//condición simple
        } else {
            System.out.println("Condicion Falsa");//Condición Multiple
        }

        //Ejercicio de Estructura If Else
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Número uno";
        } else if (numero == 2) {
            numeroTexto = "Número dos";
        } else if (numero == 3) {
            numeroTexto = "Número tres";
        } else if (numero == 4) {
            numeroTexto = "Número cuatro";
        }else{
            numeroTexto = "Número no Encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        */

        //Condicionales Switch
        Scanner leer = new Scanner(System.in);
        System.out.print("Digiite un número: ");
        var numero = Integer.parseInt(leer.nextLine());
        var numeroTexto = "Numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case  2:
                numeroTexto = "Número dos";
                break;
            case  3:
                numeroTexto = "Número tres";
                break;
            case   4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Número no Encontrado";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
