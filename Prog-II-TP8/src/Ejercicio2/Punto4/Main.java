/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.Punto4;

/**
 *
 * @author Nicolás
 */
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
