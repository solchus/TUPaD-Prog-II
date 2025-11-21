/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Nicolás
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {

    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || titulo == null || autor == null) {
            return false;
        }
        if (buscarLibroPorIsbn(isbn) != null) {
            return false;
        }
        return libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            return libros.remove(l);
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                res.add(l);
            }
        }
        return res;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores para mostrar (sin libros).");
            return;
        }
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro l : libros) {
            autoresUnicos.add(l.getAutor());
        }

        System.out.println("Autores disponibles:");
        for (Autor a : autoresUnicos) {
            System.out.println("- " + a);
        }
    }
}
