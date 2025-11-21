package Ejercicio4;

public class Animal {

    protected TipoAnimal tipo;

    public Animal(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void describirAnimal() {
        System.out.println("Este animal es del tipo " + tipo);
    }
}
