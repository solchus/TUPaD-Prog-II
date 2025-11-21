package Ejercicio4;

public class Vaca extends Animal {

    public Vaca() {
        super(TipoAnimal.VACA);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuu");
    }
}
