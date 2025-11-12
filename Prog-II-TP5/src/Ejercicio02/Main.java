package Ejercicio02;


public class Main {
    public static void main(String[] args) {
        var bateria = new Bateria("GG400", 1200);
        var usuario = new Usuario("Carlos Pérez", "32121212");
        var celular = new Celular(
                "302545883136672",
                "Samsung",
                "SG1234H",
                bateria,
                usuario
        );
        System.out.println(celular);
    }
}
