package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        var proyecto = new Proyecto("demo-3d", 10);
        var editor = new EditorVideo();
        editor.exportar("mpg", proyecto);
    }
}
