package Ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Circulo(2.5));

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " -> Área: " + f.calcularArea());
        }
    }
}
