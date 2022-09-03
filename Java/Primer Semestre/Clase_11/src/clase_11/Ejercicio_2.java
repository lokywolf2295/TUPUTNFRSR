package clase_11;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        //Ejercicio 2: En un almacen se hace un 20% de descuento a los clientes
        //cuya compra supere los $100. ¿Cuál será la cantidad que pagará una persona por su compra?
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el monto total de la compra: $");
        double monto = leer.nextDouble();
        double montoAPagar = monto;
        
        if (monto > 100){
            montoAPagar = monto*0.8;
            System.out.println("montoAPagar por el cliente es: $" + montoAPagar);
        }else{
            System.out.println("El monto a pagar por el cliente es: $" + montoAPagar);
        }
        
    }
    
}
