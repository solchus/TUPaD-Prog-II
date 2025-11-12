package Ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        var render = new Render(formato);
        System.out.println(
                "Exportando render " + render 
                + " para proyecto " + proyecto
        );
    }
}
