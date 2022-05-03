
package holamundo;

public class Holamundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Java"); 
        
        //creamos la variable tipo entero
        int num = 10;
        System.out.println(num);
        
        //reulilización de la variable
        num = 1;
        System.out.println(num);
        
        //creamos la variable tipo cadena
        String cadena = "Hola";
        System.out.println(cadena);
        //reutilizamos
        cadena = "Sigamos creciendo en programación";
        System.out.println(cadena);
        
        //TIPOS PRIMITIVOS
        
        //ENTEROS
        byte numEnteroByte = 10;
        byte numEnteroByte2 = (byte)129; //esto lo hacemos para que lo convierta al numero byte
        System.out.println("numEnteroByte = "+ numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = (short) 32767;
        System.out.println("numEnteroShort = "+ numEnteroShort);
        System.out.println("Valor minimo del Short: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Short: " + Byte.MAX_VALUE);
        
        int numEnteroInt = (int)9999999999L;//agregamos la letra L (long) en mayuscula ademas del parentesis int para numeros superiores
        System.out.println("numEnteroShort = "+ numEnteroShort);
        System.out.println("Valor minimo del Int: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Int: " + Byte.MAX_VALUE);

        long numEnteroLong = 999999999999999999L; //agregamos la letra L (long) en mayuscula ademas del parentesis int para numeros superiores
        System.out.println("numEnteroLong = " + numEnteroLong);//soutv te presenta directamente la impresion de la variable
        System.out.println("Valor minimo del Long: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Long: " + Byte.MAX_VALUE);
        
        //DECIMALES
        float numFloat =10.0F; //si o si lleba la letra F (sino lo toma como double) y se recomienda en mayuscula 
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo de Float: "+ Float.MAX_VALUE);
        
        double numDouble =10; //no es necesario poner la d porque java lo asigna a este tipo de manera predeterminada
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo de Double: "+ Float.MAX_VALUE);
    }
    
}
