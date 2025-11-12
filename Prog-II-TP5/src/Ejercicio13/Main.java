package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        var usuario = new Usuario("Alejandro A.", "test@test.com");
        var generador = new GeneradorQR();
        generador.generar("valor-qr", usuario);
    }
}
