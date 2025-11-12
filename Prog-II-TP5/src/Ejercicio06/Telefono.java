package Ejercicio06;

public class Telefono {
    private int prefijo;
    private int numero;

    public Telefono(int prefijo, int numero) {
        this.prefijo = prefijo;
        this.numero = numero;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" + "prefijo=" + prefijo + ", numero=" + numero + '}';
    }
    
}
