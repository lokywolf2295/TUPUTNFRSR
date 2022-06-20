package leccion2;

import java.util.Scanner;

public class Condicional_Ejercicio_1 {
    public static void main(String[] args) {
       
        //Ejercicio 1 Condicionales: Estaciones del Año (If Else)
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digiite el mes del año: ");
        var mes = Integer.parseInt(leer.nextLine());
        var estacion = "Estación desconocida";
        
        if (mes ==1 || mes == 2 ||mes == 3){
            estacion = "Verano";
        }else if (mes ==4 || mes == 5 ||mes == 6){
            estacion = "Otoño";
        }else if (mes ==7 || mes == 8 ||mes == 9){
            estacion = "Invierno";
        }else if (mes ==10 || mes == 11 ||mes == 12){
            estacion = "Primavera";
        }
        System.out.println("estacion = " + estacion);
    }
}
