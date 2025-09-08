import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese otro numero entero: ");
        double num2 = sc.nextDouble();
        double div = num1 / num2;
        System.out.println("El resultado de la division es: " + div);
    }
}
