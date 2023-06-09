import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("****** Aplicación Calculadora ******");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                } //Fin del if
                else if (operacion == 5) {
                    System.out.println("Gracias por usar la aplicación");
                    break; //Rompe el ciclo while y sale del programa
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                //Imprimimos un Salto de línea antes de repetir el menu
                System.out.println();
            } catch (Exception e) {//Fin del try, comienzo del catch
                System.out.println("Ocurrió un Error: " + e.getMessage());
                System.out.println();
            } //Fin del catch
        } //Fin del while
    } //Fin del método main

    private static void mostrarMenu(){
        //Mostramos el Menú
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.print("Operación a Realizar: ");
    } //Fin del método mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el Valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el Valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        double resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la Suma es: " + resultado);
            }
            case 2 -> {//Resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la Resta es: " + resultado);
            }
            case 3 -> {//Multiplicación
                resultado = operando1 * operando2;
                System.out.println("El resultado de la Multiplicación es: " + resultado);
            }
            case 4 -> {//División
                resultado = operando1 / operando2;
                System.out.println("El resultado de la División es: " + resultado);
            }
            default -> System.out.println("Opción erronea: " + operacion);
        } //Fin del switch
    } //Fin del método ejecutarOperacion

} //Fin de la clase CalculadoraUTN
