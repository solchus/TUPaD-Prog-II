package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        // 1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        // 2) Crear al menos tres autores
        Autor a1 = new Autor("A001", "Jorge Luis", "Borges", "Argentina", 1899);
        Autor a2 = new Autor("A002", "Julio", "Cortázar", "Argentina", 1914);
        Autor a3 = new Autor("A003", "Isabel", "Allende", "Chile", 1942);

        // 3) Agregar 5 libros asociados a alguno de los Autores
        biblio.agregarLibro("978-987-111", "El Aleph", 1949, a1);
        biblio.agregarLibro("978-987-222", "Ficciones", 1944, a1);
        biblio.agregarLibro("978-987-333", "Rayuela", 1963, a2);
        biblio.agregarLibro("978-987-444", "Bestiario", 1951, a2);
        biblio.agregarLibro("978-987-555", "La casa de los espíritus", 1982, a3);

        // 4) Listar todos los libros con su información y la del autor
        System.out.println("== LISTA COMPLETA ==");
        biblio.listarLibros();

        // 5) Buscar un libro por su ISBN y mostrar su información
        System.out.println("\n== BUSCAR POR ISBN: 978-987-333 ==");
        Libro buscado = biblio.buscarLibroPorIsbn("978-987-333");
        if (buscado != null) {
            System.out.println(buscado);
        } else {
            System.out.println("No se encontró el ISBN.");
        }

        // 6) Filtrar y mostrar los libros publicados en un año específico
        int anioFiltro = 1949;
        System.out.println("\n== FILTRAR POR AÑO: " + anioFiltro + " ==");
        var filtrados = biblio.filtrarLibrosPorAnio(anioFiltro);
        if (filtrados.isEmpty()) {
            System.out.println("Sin resultados para ese año.");
        } else {
            for (Libro l : filtrados) {
                System.out.println(l);
            }
        }

        // 7) Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\n== ELIMINAR ISBN 978-987-222 ==");
        System.out.println("Eliminado: " + biblio.eliminarLibro("978-987-222"));
        System.out.println("\n== LISTA POST-ELIMINACIÓN ==");
        biblio.listarLibros();

        // 8) Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n== TOTAL DE LIBROS ==");
        System.out.println("Total: " + biblio.obtenerCantidadLibros());

        // 9) Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("\n== AUTORES DISPONIBLES ==");
        biblio.mostrarAutoresDisponibles();
    }
}
