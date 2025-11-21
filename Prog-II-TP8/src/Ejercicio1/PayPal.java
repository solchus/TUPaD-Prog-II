/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolás
 */
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
