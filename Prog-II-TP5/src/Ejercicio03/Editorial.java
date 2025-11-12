package Ejercicio03;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String nombre;
    private Direccion direccion;
    private Set<Libro> libros;

    public Editorial(String nombre, String calle, String numero, 
            String codigoPostal, String localidad, String provincia) {
        this.nombre = nombre;
        this.direccion = new Direccion(
                calle, numero, codigoPostal, localidad, provincia
        );
        this.libros = new HashSet<>();
    }
    
    public void publicar(Libro libro) {
        this.libros.add(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" 
                + direccion + '}';
    }
    
}