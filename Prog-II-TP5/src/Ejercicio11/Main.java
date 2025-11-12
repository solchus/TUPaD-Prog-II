package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        var artista = new Artista("Pink Floyd", Genero.ROCK);
        var cancion = new Cancion("Money", artista);
        var reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
