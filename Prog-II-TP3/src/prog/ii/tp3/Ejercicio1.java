package prog.ii.tp3;

public class Ejercicio1 {

    public static class Estudiante {

        private String nombre;
        private String apellido;
        private String curso;
        private double calificacion;

        public Estudiante(String nombre, String apellido, String curso,
                double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        public void mostrarInfo() {
            System.out.println("Estudiante{" + "nombre=" + nombre);
            System.out.println("Apellido=" + apellido);
            System.out.println("Curso=" + curso);
            System.out.println("Calificacion=" + calificacion);
        }

        public void subirCalificacion(double puntos) {
            this.calificacion += puntos;
        }

        public void bajarCalificacion(double puntos) {
            this.calificacion -= puntos;
        }
    }

    public static void main(String[] args) {
        System.out.println("Se da de alta a un estudiante:");
        var estudiante = new Estudiante("Sol", "Couchot", "Programación 2", 8);
        estudiante.mostrarInfo();
        System.out.println("Se sube su calificación:");
        estudiante.subirCalificacion(2);
        estudiante.mostrarInfo();
        System.out.println("Se baja su calificación:");
        estudiante.bajarCalificacion(1);
        estudiante.mostrarInfo();
    }
}
