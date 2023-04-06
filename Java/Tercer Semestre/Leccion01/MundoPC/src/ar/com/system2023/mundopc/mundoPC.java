package ar.com.system2023.mundopc;

public class mundoPC {

    public static void main(String[] args) {

        //Creamos los objetos de cada clase
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP",monitorHP,tecladoHP,ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("ComputadoraGamer",monitorGamer,tecladoGamer,ratonGamer);

        //Creamos la Orden
        Orden orden1 = new Orden();
        //Agregamos las computadoras a la lista
        orden1.agregarCompuradora(computadoraHP);
        orden1.agregarCompuradora(computadoraGamer);
        //mostramos la lista de ordenes.
        orden1.mostrarOrden();

        //Creamos otra orden
        Orden orden2 = new Orden();
        //Creamos una nueva Computadora
        Computadora computadorasVarias = new Computadora("Computadoras de Diferentes Marcas y modelos",monitorGamer,tecladoHP,ratonHP);
        //Agregamos la computadora a la orden
        orden2.agregarCompuradora(computadorasVarias);
        //mostramos la lista de ordenes.
        orden2.mostrarOrden();
 }
}
