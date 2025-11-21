package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "CREADO";
        notificarEstado();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarEstado();
    }

    private void notificarEstado() {
        if (cliente != null) {
            cliente.notificarCambioEstado(estado);
        }
    }

    public String getEstado() {
        return estado;
    }
}
