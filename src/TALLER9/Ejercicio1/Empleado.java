package TALLER9.Ejercicio1;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // llama al constructor de TALLER9.TALLER10.Ejercicio1.TALLER10.Ejercicio1.Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // reutiliza el método del padre
        System.out.println("Departamento: " + departamento);
    }
}
