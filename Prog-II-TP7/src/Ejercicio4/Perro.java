/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
public class Perro extends Animal {

    public Perro() {
        super(TipoAnimal.PERRO);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}
