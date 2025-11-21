package Ejercicio1;

public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificarCambioEstado(String estado) {
        System.out.println("Notificando a " + nombre + " (" + email + "): "
                + "el estado de su pedido ahora es: " + estado);
    }
}
