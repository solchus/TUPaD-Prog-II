package Ejercicio11;

public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println(
                "Reproduciendo canción " 
                        + cancion.getTitulo() 
                        + " del artista " 
                        + cancion.getArtista().getNombre()
        );
    }
}
