package prog.ii.tp3;

public class Ejercicio2 {

    public static class Mascota {

        private String nombre;
        private String especie;
        private int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Mascota{" + "Nombre=" + nombre );
            System.out.println("Especie=" + especie );
            System.out.println("Edad=" + edad);
        }

        public void cumplirAnios() {
            this.edad++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Se registra una mascota:");
        var mascota = new Mascota("Olga", "Gato atigrado", 4);
        mascota.mostrarInfo();
        System.out.println("Se actualiza edad 2 años:");
        for (int i = 0; i < 2; i++) {
            mascota.cumplirAnios();
        }
        mascota.mostrarInfo();
    }
}
