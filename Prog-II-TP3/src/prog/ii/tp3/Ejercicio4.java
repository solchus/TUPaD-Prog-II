package prog.ii.tp3;

import java.util.Random;

public class Ejercicio4 {

    public static class Gallina {

        private int idGalina;
        private int edad;
        private int huevosPuestos;

        public Gallina(int idGalina) {
            this.idGalina = idGalina;
            this.edad = 0;
            this.huevosPuestos = 0;
        }

        public void ponerHuevo() {
            this.huevosPuestos++;
        }

        public void envejecer() {
            this.edad++;
        }

        public void mostrarEstado() {
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "Gallina{" + "idGalina=" + idGalina + ", edad=" + edad + ", huevosPuestos=" + huevosPuestos + '}';
        }
    }

    public static void main(String[] args) {
        var random = new Random();
        var granjaDigital = new Gallina[2];
        System.out.println("Creamos dos gallinas");
        granjaDigital[0] = new Gallina(0);
        granjaDigital[1] = new Gallina(1);
        for (int i = 0; i < 10; i++) {
            System.out.println("# Año " + (i + 1));
            for (var gallina : granjaDigital) {
                simularAño(gallina, random);
            }
        }
    }

    private static void simularAño(Gallina gallina, Random random) {
        gallina.envejecer();
        var huevosAPoner = random.nextInt(100);
        System.out.println("- La gallina " + gallina.idGalina + " va a poner " + huevosAPoner + " huevos");
        for (int i = 0; i < huevosAPoner; i++) {
            gallina.ponerHuevo();
        }
        System.out.println("- Estado final de gallina: " + gallina);
    }
}
