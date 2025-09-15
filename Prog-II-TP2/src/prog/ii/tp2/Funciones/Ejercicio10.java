/*
Actualización de stock a partir de venta y recepción de productos. Crea un método 
actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
que calcule el nuevo stock después de una venta y recepción de productos: 
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado. 
Ejemplo de entrada/salida: 
Ingrese el stock actual del producto: 50 
Ingrese la cantidad vendida: 20 
Ingrese la cantidad recibida: 30 
El nuevo stock del producto es: 60 
 */
package prog.ii.tp2.Funciones;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(scanner.nextLine());
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
