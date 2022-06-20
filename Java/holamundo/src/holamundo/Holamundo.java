package holamundo;

import java.util.Scanner;

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

        // reglas p[ara definir una variable en Java
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        //Ejercicios caracteres especiales  con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); // diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);// tabulador un espacio para centrar
        System.out.println("\t\t :Menu: \t");
        System.out.println("Retroceso: \b" + nombre); //caracter de retroceso
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        //TIPOS PRIMITIVOS
        //ENTEROS
        byte numEnteroByte = 10;
        byte numEnteroByte2 = (byte) 129; //esto lo hacemos para que lo convierta al numero byte
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);

        short numEnteroShort = (short) 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Short: " + Byte.MAX_VALUE);

        int numEnteroInt = (int) 9999999999L;//agregamos la letra L (long) en mayuscula ademas del parentesis int para numeros superiores
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Int: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Int: " + Byte.MAX_VALUE);

        long numEnteroLong = 999999999999999999L; //agregamos la letra L (long) en mayuscula ademas del parentesis int para numeros superiores
        System.out.println("numEnteroLong = " + numEnteroLong);//soutv te presenta directamente la impresion de la variable
        System.out.println("Valor minimo del Long: " + Byte.MIN_VALUE);//los valores en mayusculas son clases
        System.out.println("Valor maximo del Long: " + Byte.MAX_VALUE);

        //DECIMALES
        float numFloat = 10.0F; //si o si lleba la letra F (sino lo toma como double) y se recomienda en mayuscula 
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de Float: " + Float.MAX_VALUE);

        double numDouble = 10; //no es necesario poner la d porque java lo asigna a este tipo de manera predeterminada
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de Double: " + Float.MAX_VALUE);

        // Inferencia de tipo var y tipos primitivos
    
        // tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024'; // Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varValorDecimal = 36; // valor decimal  
        System.out.println("varValorDecimal = " + varValorDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        var varCaracter1 = '\u0024'; // Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varValorDecimal1 = 36; // valor dlo tomara com int Entero 
        System.out.println("varValorDecimal1 = " + varValorDecimal1);
        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);

        // tipos primitivos Tipos Booleanos   
        var varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es Verde");
        } else {
            System.out.println("La bandera es roja");
        }
        //Algoritmo es mayor de edad
        var edad = 20; // tener presente la inferencia de tipos
        // var adulto = edad >= 18; //Esta es una expresion booleana
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        // conversion de tipos primitivos
        var edades = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // pedir un valor al ususario
        System.out.println("Escriba su edad");
        edad = Integer.parseInt( entrada.nextLine());
        System.out.println("edad = " + edad);

        // Conversion de tipo primitivos parte 2
        var edadTexto = String.valueOf(10); 
        System.out.println("edadTexto = " + edadTexto);
//     
        var fraseChar = "Programadores".charAt(0);
        System.out.println("fraseChar = " + fraseChar);
//        
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro:");
        System.out.println("Digite el nombre del libro:");
        nombre = entrada.nextLine();
        System.out.println("Digite el id del libro");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite el precio del libro:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratis true / false: ");
        boolean envioGratis = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nombre:" + nombre);
        System.out.println("ID:" + id);
        System.out.println("precio $:" + precio);
        System.out.println("Envio gratuito " + envioGratis);

        // operadores matematicos
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion  de la multiplicacion = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);

        solucion = num1 % num2; // guarda el residuo entero de la divisioien
        System.out.println("solucion = " + solucion);

        if (num1 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }  
                 int varNum1 = 1
        , varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // Una operacion
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1; //varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);

        // -=      *=      /=      %=
        varNum1 -= 1; //varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);

        varNum1 *= 1; //varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);

        varNum1 /= 1; //varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);

        varNum1 %= 1; //varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        //Operadores Unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        //Operadores Unarios: negacion
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: preincremento
        var varE = 9;
        var varF = ++varE;
        //Primero se incrementa la variable y despues usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //Operadores Unarios de Incremento: posincremento
        var varG = 3;
        var varH = varG++;
        //primero usa su valor y luego hace el aumento de la variable
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varF);
        
        //Operadores Unarios de Decremento: predecremento
        var varI = 9;
        var varJ = --varI;
        //Primero se decrementa la variable y despues usa su valor
        System.out.println("varE = " + varI);
        System.out.println("varF = " + varJ);
        
        //Operadores Unarios de Decremento: posdecremento
        var varK = 3;
        var varL = varK++;
        //primero usa su valor y luego hace el decremento de la variable
        System.out.println("varG = " + varK);
        System.out.println("varH = " + varL);
        
        //Operadores de Igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = (aNum != bNum);
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum >= bNum;// podemios usar >= <= == !=
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0){
            System.out.println("El numero es par");
        }else{
                    System.out.println("El numero es impar");
                    }
        
        var anio = 30;
        var adulto = 18;
        if (anio >=adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
        //Operadores condicionales and
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        }else{
            System.out.println("Está fuera del rango establecido");
        }
        
        //Operadores condicionales or
        var vacaciones = false;
        var diaLibre = true;
       
        
        if(vacaciones || diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo");
        }else{
            System.out.println("Papá NO puede asistir al juego de su hijo");
        }
        
        //Operador Ternario
        var resultadoT = (5>4)? "Verdadero":"Falso";//primero condición y luego decide la respuesta a dar
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT %2 == 0)?"Par":"Impar";
        System.out.println("numeroT = " + numeroT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4+5)*6/3;
    }
}
