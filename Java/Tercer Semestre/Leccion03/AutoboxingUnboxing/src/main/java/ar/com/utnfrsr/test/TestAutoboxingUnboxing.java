package ar.com.utnfrsr.test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = la clase envolvente es Integer
            long = la clase envolvente es Long
            float = la clase envolvente es Float
            double = la clase envolvente es Double
            boolean = la clase envolvente es Boolean
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
         */
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Clase envolvente (Tipo objet de la clase Integer)
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing (Se convierte de tipo primitivo a objeto)

        int entero2 = entero; //Unboxing (Se convierte de objeto a tipo primitivo)
    }


}