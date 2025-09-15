/*
1. Verificación de Año Bisiesto. 
Escribe un programa en Java que solicite al 
usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, 
salvo que sea divisible por 400. 
Ejemplo de entrada/salida: 
Ingrese un año: 2024 
El año 2024 es bisiesto. 
Ingrese un año: 1900 
El año 1900 no es bisiesto. 
 */
package prog.ii.tp2.EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println("Ingrese un año: ");
        var scanner = new Scanner(System.in);
        var año = Integer.parseInt(scanner.nextLine());
        if (esAñoBisiesto(año)) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }

    static boolean esAñoBisiesto(int año) {
        return (0 == año % 4)
                && (0 != año % 100 || 0 == año % 400);
    }
}
