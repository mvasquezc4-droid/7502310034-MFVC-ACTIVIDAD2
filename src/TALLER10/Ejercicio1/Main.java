package TALLER10.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona();
        personas[1] = new Estudiante();
        personas[2] = new Profesor();


        for (Persona p : personas) {
            p.presentarse();
        }
    }
}