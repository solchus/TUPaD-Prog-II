package Ejercicio03;

public class Main {

    public static void main(String[] args) {
        var editorial = new Editorial(
                "P&J",
                "Mario Bravo",
                "835",
                "C1139AAN",
                "CABA",
                "CABA"
        );
        var autor = new Autor("Mariana Macome", "Argentina");
        var libro = new Libro(
                "La reina del hielo seco",
                "9789506443412",
                editorial,
                autor
        );

        System.out.println(libro);
    
    }
}