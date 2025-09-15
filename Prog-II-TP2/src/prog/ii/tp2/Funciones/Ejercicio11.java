/*
Cálculo de descuento especial usando variable global. 
Declara una variable global 
Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) 
que use la variable global para calcular el descuento especial del 10%. 
Dentro del método, declara una variable local descuentoAplicado, almacena el valor 
del descuento y muestra el precio final con descuento. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 200 
El descuento especial aplicado es: 20.0 
El precio final con descuento es: 180.0 
 */
package prog.ii.tp2.Funciones;

import java.util.Scanner;

public class Ejercicio11 {

    private static final double DESCUENTO_ESPECIAL = 0.1;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        var precioLista = Integer.parseInt(scanner.nextLine());
        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precioLista, DESCUENTO_ESPECIAL));
        System.out.println("El precio final con descuento es: " + calcularPrecioFinal(precioLista, DESCUENTO_ESPECIAL));

    }

    public static double calcularDescuentoEspecial(double precioLista, double DESCUENTO_ESPECIAL) {
        return precioLista * DESCUENTO_ESPECIAL;
    }

    public static double calcularPrecioFinal(double precioLista, double DESCUENTO_ESPECIAL) {
        return precioLista - calcularDescuentoEspecial(precioLista, DESCUENTO_ESPECIAL);
    }
}
