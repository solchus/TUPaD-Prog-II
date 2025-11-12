package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        var contribuyente = new Contribuyente("Carlos Perez", "20121212125");
        var impuesto = new Impuesto(525.0d, contribuyente);
        var calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}