package Ejercicio01;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var titular = new Titular(
                "Martin Gonzalez",
                "135798642"
        );
        var pasaporte = new Pasaporte(
                "AAA123123",
                LocalDate.now(),
                LocalDate.now(),
                "AR",
                titular,
                "12345432asdfg3432",
                "png");

        System.out.println(pasaporte);
    }
}
