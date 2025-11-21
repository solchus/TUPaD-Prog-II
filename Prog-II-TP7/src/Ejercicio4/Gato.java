/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
public class Gato extends Animal {

    public Gato() {
        super(TipoAnimal.GATO);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
