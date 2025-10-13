package prog.ii.tp3;

public class Ejercicio5 {

    public static class NaveEspacial {

        private final int LIMITE_COMBUSTIBLE = 100;
        private String nombre;
        private int combustible;
        private int distanciaActual;

        public NaveEspacial(String nombre, int combustible) {
            this.nombre = nombre;
            recargarCombustible(combustible);
        }

        public void despegar() {
            System.out.println("Despegando...");
        }

        ;
        
        public void avanzar(int distancia) {
            if (this.combustible < distancia) {
                System.out.println("Error: El combustible no es suficiente para avanzar esa distancia");
            } else {
                this.distanciaActual += distancia;
                this.combustible -= distancia;
            }
        }

        public void recargarCombustible(int cantidad) {
            if (this.combustible + cantidad > LIMITE_COMBUSTIBLE) {
                System.out.println("Error: No se puede superar el límite de combustible");
                this.combustible = LIMITE_COMBUSTIBLE;
            } else {
                this.combustible += cantidad;
            }
        }

        public void mostrarEstado() {
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "NaveEspacial{" + "LIMITE_COMBUSTIBLE="
                    + LIMITE_COMBUSTIBLE + ", nombre=" + nombre
                    + ", combustible=" + combustible + ", distanciaActual="
                    + distanciaActual + '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("# Creamos una nave y despegamos:");
        var nave = new NaveEspacial("UTN", 50);
        nave.mostrarEstado();

        System.out.println("# Intentamos avanzar 70");
        nave.avanzar(70);
        nave.mostrarEstado();

        System.out.println("# Recargamos...");
        nave.recargarCombustible(25);
        nave.mostrarEstado();

        System.out.println("# Avanzamos 70");
        nave.avanzar(70);
        nave.mostrarEstado();
    }
}
