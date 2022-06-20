package leccion2;

import java.util.Scanner;

public class Condicional_Ejercicio_2 {
    public static void main(String[] args) {
        //Ejercicio 2 Condicionales: Estaciones del Año (Switch)
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digiite el mes del año: ");
        var mes = Integer.parseInt(leer.nextLine());
        var estacion = "Estación desconocida";
        
        switch (mes) {
            case 1:case 2: case 3:
            estacion = "Verano";
            break;
        case 4:case 5: case 6:
            estacion = "Otoño";
            break;
        case 7:case 8: case 9:
            estacion = "Invierno";
            break;
        case 10:case 11: case 12:
            estacion = "Primavera";
            break;
            
        }
        System.out.println("estacion = " + estacion);
    }
}
