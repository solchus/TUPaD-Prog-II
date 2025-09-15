/*
Contador de Positivos, Negativos y Ceros (for). 
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros. 
Ejemplo de entrada/salida: 
Ingrese el número 1: -5 
Ingrese el número 2: 3 
Ingrese el número 3: 0 
Ingrese el número 4: -1 
Ingrese el número 5: 6 
Ingrese el número 6: 0 
Ingrese el número 7: 9 
Ingrese el número 8: -3 
Ingrese el número 9: 4 
Ingrese el número 10: -8 
Resultados: 
Positivos: 4 
Negativos: 4 
Ceros: 2 
 */
package prog.ii.tp2.EstructurasDeRepeticion;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numIngresado;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un numero entero: ");
            numIngresado = Integer.parseInt(scanner.nextLine());
            if (numIngresado > 0) {
                positivos += 1;
            } else if (numIngresado == 0) {
                ceros += 1;
            } else {
                negativos += 1;
            }

        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
}
