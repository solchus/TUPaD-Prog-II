package Ejercicio06;


public class Cliente {
    private String nombre;
    private Telefono telefono;

    public Cliente(String nombre, int prefijo, int numero) {
        this.nombre = nombre;
        this.telefono = new Telefono(prefijo, numero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}
