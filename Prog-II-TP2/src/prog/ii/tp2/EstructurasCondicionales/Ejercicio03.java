/*
Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 
Ejemplo de entrada/salida: 
Ingrese su edad: 25 
Eres un Adulto. 
Ingrese su edad: 10 
Eres un Niño. 
 */
package prog.ii.tp2.EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        if (edad <= 0) {
            System.out.println("Ingrese una edad valida.");
        } else if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }
}
