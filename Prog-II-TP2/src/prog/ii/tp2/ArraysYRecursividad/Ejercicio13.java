/*
Impresión recursiva de arrays antes y después de modificar un elemento. Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Use una función recursiva para mostrar los precios originales. 
c. Modifique el precio de un producto específico. 
d. Use otra función recursiva para mostrar los valores modificados. 
Salida esperada: 
Precios originales: 
Precio: $199.99 
Precio: $299.5 
Precio: $149.75 
Precio: $399.0 
Precio: $89.99 
Precios modificados: 
Precio: $199.99 
Precio: $299.5 
Precio: $129.99 
Precio: $399.0 
Precio: $89.99 
 */
package prog.ii.tp2.ArraysYRecursividad;

public class Ejercicio13 {

    public static void main(String[] args) {
        var precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        imprimirPreciosRecursivamente(precios, 0);
        precios[3] = 500;
        System.out.println("Precios modificados: ");
        imprimirPreciosRecursivamente(precios, 0);
    }

    private static void imprimirPreciosRecursivamente(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: " + precios[indice++]);
            imprimirPreciosRecursivamente(precios, indice);
        }
    }
}
