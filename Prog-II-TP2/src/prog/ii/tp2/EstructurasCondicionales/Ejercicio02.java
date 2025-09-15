/*
2. Determinar el Mayor de Tres Números. 
Escribe un programa en Java que pida al usuario tres números 
enteros y determine cuál es el mayor. 
Ejemplo de entrada/salida: 
Ingrese el primer número: 8 
Ingrese el segundo número: 12 
Ingrese el tercer número: 5 
El mayor es: 12 
 */
package prog.ii.tp2.EstructurasCondicionales;


import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {  
        var scanner = new Scanner(System.in);
        var mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i+1) + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
