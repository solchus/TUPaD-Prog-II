/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
public class Vaca extends Animal {

    public Vaca() {
        super(TipoAnimal.VACA);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuu");
    }
}
