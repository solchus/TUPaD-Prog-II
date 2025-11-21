package Ejercicio2.Punto4;

public class Main {

    public static void main(String[] args) {

        try {
            Persona p = new Persona("Juan", 150);
            System.out.println("Persona creada correctamente.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
