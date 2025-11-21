package Ejercicio1;

public class PayPal implements Pago {

    private String emailCuenta;

    public PayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal de la cuenta " + emailCuenta);
    }
}
