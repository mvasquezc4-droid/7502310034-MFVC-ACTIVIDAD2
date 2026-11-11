package TALLER9.Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // invoca el constructor de TALLER9.TALLER10.Ejercicio2.TALLER9.TALLER10.Ejercicio3.Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}