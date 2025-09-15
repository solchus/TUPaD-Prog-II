/*
Suma de Números Pares (while). 
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que 
se debe mostrar la suma total de los pares ingresados. 
Ejemplo de entrada/salida: 
Ingrese un número (0 para terminar): 4 
Ingrese un número (0 para terminar): 7 
Ingrese un número (0 para terminar): 2 
Ingrese un número (0 para terminar): 0 
La suma de los números pares es: 6 
 */
package prog.ii.tp2.EstructurasDeRepeticion;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numAcumulador = 0;
        int numIngresado;
        do {
            System.out.print("Ingrese un numero: ");
            numIngresado = Integer.parseInt(scanner.nextLine());
            if (numIngresado % 2 == 0) {
                numAcumulador += numIngresado;
            }
        } while (0 != numIngresado);
        System.out.println("La suma de los numeros pares es " + numAcumulador);
    }
}
