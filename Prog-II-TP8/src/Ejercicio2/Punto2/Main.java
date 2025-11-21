package Ejercicio2.Punto2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: la cadena ingresada no es un numero entero valido.");
        }

        scanner.close();
    }
}
