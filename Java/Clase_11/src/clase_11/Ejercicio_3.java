package clase_11;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        //Ejercicio 3: Leer 2 numeros:; si son iguales que los multiplique
                                    //  si el primero es mayor que el segundo que los reste
                                    // y sino que los sume
                                    
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el primer número: ");
        int numero2 = leer.nextInt();
        
        int resultado = 0;
        
        //comprobamos si los numeros son iguales
        if(numero1 == numero2){
            resultado = numero1 * numero2;
        }else if(numero1>numero2){
            resultado = numero1 - numero2;
        }else{
            resultado = numero1 + numero2;
        }
        
        System.out.println("El resultado obtenido de ambos números es: " + resultado);
    }
    
}
