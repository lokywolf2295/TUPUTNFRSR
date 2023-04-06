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


        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los métodos al maximo rendimiento

        //Creamos los objetos de cada clase
        Monitor monitorSamsung = new Monitor("Samsung", 13);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("ComputadoraSamsung",monitorSamsung,tecladoSamsung,ratonSamsung);

        Monitor monitorTokio = new Monitor("Tokio", 13);
        Teclado tecladoTokio = new Teclado("Bluetooth", "Tokio");
        Raton ratonTokio = new Raton("Bluetooth", "Tokio");
        Computadora computadoraTokio = new Computadora("ComputadoraTokio",monitorTokio,tecladoTokio,ratonTokio);

        Monitor monitorHitachi = new Monitor("Hitachi", 13);
        Teclado tecladoHitachi = new Teclado("Bluetooth", "Hitachi");
        Raton ratonHitachi = new Raton("Bluetooth", "Hitachi");
        Computadora computadoraHitachi = new Computadora("ComputadoraHitachi",monitorHitachi,tecladoHitachi,ratonHitachi);

        Monitor monitorSnapDragon = new Monitor("SnapDragon", 13);
        Teclado tecladoSnapDragon = new Teclado("Bluetooth", "SnapDragon");
        Raton ratonSnapDragon = new Raton("Bluetooth", "SnapDragon");
        Computadora computadoraSnapDragon = new Computadora("ComputadoraSnapDragon",monitorSnapDragon,tecladoSnapDragon,ratonSnapDragon);

        Monitor monitorNSX = new Monitor("NSX", 13);
        Teclado tecladoNSX = new Teclado("Bluetooth", "NSX");
        Raton ratonNSX = new Raton("Bluetooth", "NSX");
        Computadora computadoraNSX = new Computadora("ComputadoraNSX",monitorNSX,tecladoNSX,ratonNSX);

        Monitor monitorAsus = new Monitor("Asus", 13);
        Teclado tecladoAsus = new Teclado("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("ComputadoraAsus",monitorAsus,tecladoAsus,ratonAsus);

        Monitor monitorLogitech = new Monitor("Logitech", 13);
        Teclado tecladoLogitech = new Teclado("Bluetooth", "Logitech");
        Raton ratonLogitech = new Raton("Bluetooth", "Logitech");
        Computadora computadoraLogitech = new Computadora("ComputadoraLogitech",monitorLogitech,tecladoLogitech,ratonLogitech);

        //Agregamos las nuevas computadoras a la orden uno para cumplir con la consigna
        orden1.agregarCompuradora(computadorasVarias);
        orden1.agregarCompuradora(computadoraSamsung);
        orden1.agregarCompuradora(computadoraTokio);
        orden1.agregarCompuradora(computadoraHitachi);
        orden1.agregarCompuradora(computadoraSnapDragon);
        orden1.agregarCompuradora(computadoraNSX);
        orden1.agregarCompuradora(computadoraAsus);
        orden1.agregarCompuradora(computadoraLogitech);

        //mostramos la lista de ordenes llena.
        orden1.mostrarOrden();

        //Agregamos una pc mas para probar el maximo de la orden
        orden1.agregarCompuradora(computadorasVarias);

        //mostramos la lista de ordenes llena y no se agrega la ultima pc ya que superó el maximo.
        orden1.mostrarOrden();
    }
}
