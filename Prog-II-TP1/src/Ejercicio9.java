
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR
        System.out.println("Hola, " + nombre);
    }
}