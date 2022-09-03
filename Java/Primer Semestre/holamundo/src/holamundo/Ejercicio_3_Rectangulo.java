package holamundo;
import java.util.Scanner;
public class Ejercicio_3_Rectangulo {
    public static void main(String[] args) {
        //Ejercicio 3: Rectangulo
        
        //Se solicita calcular el area y el perimetro del rectangulo, para eso debemos crear las variables:
        //Alto(int)
        //Ancho(int)
        //El usuario debe proporcionar los valores de Alto y Ancho y despues se debe imprimir en el siguiente formato:(recuerden no usar acentos, respetar los espacios, las minusculas y los saltos de lineas)
        //Le decimos al usuario:
        //Digite el alto del rectangulo:
        //Digite el ancho del rentangulo:
        
        //Formulas:
        //Area = alto * ancho
        //Perimetro = (alto + ancho) * 2
        //¿Cual es el codigo del Ejercicio?
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite el alto del rectangulo:");
        int alto = Integer.parseInt(leer.nextLine());
        System.out.print("Digite el ancho del rentangulo:");
        int ancho = Integer.parseInt(leer.nextLine());
        
        int area = alto * ancho;
        int perimetro = (alto + ancho)*2;
        
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
