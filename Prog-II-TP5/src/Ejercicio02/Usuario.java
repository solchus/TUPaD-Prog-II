package Ejercicio02;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nombre;
    private String dni;
    private Set<Celular> celulares;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.celulares = new HashSet<>();
    }

    public void agregarCelular(Celular celular) {
        this.celulares.add(celular);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Celular> getCelulares() {
        return celulares;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}
