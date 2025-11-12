package Ejercicio08;

public class Main {
    public static void main(String[] args) {
        var usuario = new Usuario("Francisco A.", "frana@falso.falso");
        var documento = new Documento("Título del docu", "Contenido", usuario);
        
        System.out.println(documento);
    }
}
