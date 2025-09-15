/*
Modificación de un array de precios y visualización de resultados. Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Muestre los valores originales de los precios. 
c. Modifique el precio de un producto específico. 
d. Muestre los valores modificados. 
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

public class Ejercicio12 {

    public static void main(String[] args) {
        var precios = new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        imprimirPrecios(precios);
        precios[3] = 500;
        System.out.println("Precios modificados: ");
        imprimirPrecios(precios);
    }

    private static void imprimirPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: " + precio);
        }
    }
}
