/*
Cálculo del Precio Final con impuesto y descuento. 
Crea un método calcularPrecioFinal(double impuesto, double 
descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento) 
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, 
llama al método y muestra el precio final. 
Ejemplo de entrada/salida: 
Ingrese el precio base del producto: 100 
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5 
El precio final del producto es: 105.0 
 */
package prog.ii.tp2.Funciones;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        var precioBase = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        var impuesto = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        var descuento = Integer.parseInt(scanner.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(impuesto, descuento, precioBase));
    }

    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
}
