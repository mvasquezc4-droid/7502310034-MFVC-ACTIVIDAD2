package TALLER10.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Bicicleta bicicleta1 = new Bicicleta();

        vehiculo1.moverse();
        bicicleta1.moverse();

        Vehiculo vehiculo2 = new Bicicleta();
        vehiculo2.moverse();
    }
}