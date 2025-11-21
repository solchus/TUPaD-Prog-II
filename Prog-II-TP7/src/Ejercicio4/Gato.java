package Ejercicio4;

public class Gato extends Animal {

    public Gato() {
        super(TipoAnimal.GATO);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
