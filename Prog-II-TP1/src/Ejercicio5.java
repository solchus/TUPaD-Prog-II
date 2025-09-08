/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author solcu
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Los resultados de operaciones basicas son:");
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + mult);
        System.out.println("Division = " + div);

    }
}
