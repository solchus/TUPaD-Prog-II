/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.Punto2;

/**
 *
 * @author Nicolás
 */
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
