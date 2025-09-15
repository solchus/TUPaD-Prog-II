/*
Composición de funciones para calcular costo de envío y total de compra. 
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado 
en la zona de envío (Nacional o Internacional) y el peso del paquete. 
Nacional: $5 por kg 
Internacional: $10 por kg 
b. calcularTotalCompra(double precioProducto, double 
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío. 
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. 
Luego, muestra el total a pagar. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 50 
Ingrese el peso del paquete en kg: 2 
Ingrese la zona de envío (Nacional/Internacional): Nacional 
El costo de envío es: 10.0 
El total a pagar es: 60.0 
 */
package prog.ii.tp2.Funciones;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        var precio = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el peso del paquete: ");
        var peso = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        var zona = scanner.nextLine();
        var costoEnvio = calcularCostoEnvio(peso, zona);
        var costoFinal = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + costoFinal);
    }

    public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        return switch (zona.toLowerCase()) {
            case "nacional" ->
                5 * peso;
            case "internacional" ->
                10 * peso;
            default ->
                throw new IllegalArgumentException("Zona inválida: " + zona);
        };
    }

}
