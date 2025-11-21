package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "juan@mail.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        //TarjetaCredito tc = new TarjetaCredito("Juan", "1234-5678", 10);
        //tc.procesarPago(total);
        
        Pago paypal = new PayPal("juan.paypal@mail.com");
        paypal.procesarPago(total);

        pedido.setEstado("PAGADO");
        pedido.setEstado("ENVIADO");
    }
}
