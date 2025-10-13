package prog.ii.tp3;

public class Ejercicio3 {

    public static class Libro {

        private String titulo;
        private String autor;
        private int añoPublicacion;

        public Libro(String titulo, String autor, int añoPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            setAñoPublicacion(añoPublicacion);
        }

        public void setAñoPublicacion(int añoPublicacion) {
            if (añoPublicacion > 0) {
                this.añoPublicacion = añoPublicacion;
            } else {
                System.out.println("Error: El año " + añoPublicacion + " no es válido. No se actualizará");
            }
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getAñoPublicacion() {
            return añoPublicacion;
        }

        @Override
        public String toString() {
            return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Creamos un libro:");
        var libro = new Libro("Estudio en Escarlata", "Sir Arthur Conan Doyle", 1887);
        System.out.println(libro);

        System.out.println("Intentamos actualizar a un año no válido:");
        libro.setAñoPublicacion(-500);
        System.out.println(libro);

        System.out.println("Intentamos actualizar a un año válido:");
        libro.setAñoPublicacion(2005);
        System.out.println(libro);
    }
}
