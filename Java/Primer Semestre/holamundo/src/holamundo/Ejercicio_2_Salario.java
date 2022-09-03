package holamundo;

import java.util.Scanner;

public class Ejercicio_2_Salario {

    public static void main(String[] args) {
        /*
        Ejercicio 2:
        Hacer un programa que calcule e imprima el salario de un empleado, 
        a partir de sus horas semanales trabajadas y de su salario por hora.
        */
        
          Scanner entrada = new Scanner(System.in);
     int horasSemanales;
     float salarioHora, salarioTotal;
     
        System.out.print("Digite las horas semanales trabajadas: ");
        horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el salario que cobra por horas: ");
        salarioHora = Float.parseFloat(entrada.nextLine());
        salarioTotal = horasSemanales * salarioHora;
        System.out.println("\nEl salario semanal es: S"+salarioTotal);
    
    }
    
}
