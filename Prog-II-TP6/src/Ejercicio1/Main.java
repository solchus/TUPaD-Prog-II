/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos y agregarlos
        Producto p1 = new Producto("P-001", "Arroz 1kg", 1500, 40, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P-002", "Remera básica", 2800, 25, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P-003", "Licuadora", 32000, 10, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("P-004", "Auriculares", 5200, 60, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("P-005", "Café molido 500g", 2900, 15, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("== LISTA COMPLETA ==");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n== BUSCAR POR ID: P-004 ==");
        Producto buscado = inventario.buscarProductoPorId("P-004");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        System.out.println("\n== FILTRAR POR CATEGORÍA: ALIMENTOS ==");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        // 5. Eliminar un producto por ID y listar
        System.out.println("\n== ELIMINAR P-002 (REMERAS) ==");
        boolean eliminado = inventario.eliminarProducto("P-002");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("\n== LISTA POST-ELIMINACIÓN ==");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n== ACTUALIZAR STOCK P-001 a 55 ==");
        boolean actualizado = inventario.actualizarStock("P-001", 55);
        System.out.println("Actualizado: " + actualizado);
        inventario.buscarProductoPorId("P-001").mostrarInfo();

        // 7. Total de stock disponible
        System.out.println("\n== TOTAL DE STOCK ==");
        System.out.println("Unidades totales: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n== PRODUCTO CON MAYOR STOCK ==");
        Producto top = inventario.obtenerProductoConMayorStock();
        if (top != null) {
            top.mostrarInfo();
        }

        // 9. Filtrar productos por precio entre $1000 y $3000
        System.out.println("\n== FILTRAR POR PRECIO $1000 - $3000 ==");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorías disponibles con descripciones
        System.out.println("\n== CATEGORÍAS DISPONIBLES ==");
        inventario.mostrarCategoriasDisponibles();
    }
}
