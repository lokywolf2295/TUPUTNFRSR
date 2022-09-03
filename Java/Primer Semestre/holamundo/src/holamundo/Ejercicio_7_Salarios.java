package holamundo;

import java.util.Scanner;

public class Ejercicio_7_Salarios {

    public static void main(String[] args) {
        
        //Ejercicio 7: Una Compañia de venta de carros usados, paga a su personal de vetas
        //un salario de $1000 mensuales mas una comisión de $150 por cada carro vendido, 
        //más el 5% del valor de venta por carro. 
        //Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
        //Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
        //El salario de 1000 lo vamos a manejar como un dato constante, 
        //para ello usar la palabra reservada "final"
        
        Scanner leer = new Scanner(System.in);
        
        final float salarioFijo = 1000;  //creamos una variable constante
        
        System.out.print("Ingrese el Precio del Carro Vendido: $");
        float valorCarro = Float.parseFloat(leer.nextLine());
        
        System.out.print("Ingrese la Cantidad de Carros Vendidos: ");
        int carrosVendidos = Integer.parseInt(leer.nextLine());
        
        final var comisionFija = 150;
        var comisionPorcentaje = valorCarro * 0.05;
        
        var comisionTotal = (comisionFija*carrosVendidos) + (comisionPorcentaje*carrosVendidos);
        
        var salarioTotal = salarioFijo + comisionTotal;
        System.out.println("El total a pagar al Empleado es: $" + salarioTotal);
    }
    
}
