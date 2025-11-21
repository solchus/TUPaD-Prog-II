package Ejercicio4;

public class Perro extends Animal {

    public Perro() {
        super(TipoAnimal.PERRO);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}
