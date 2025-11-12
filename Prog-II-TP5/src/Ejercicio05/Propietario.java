package Ejercicio05;

import java.util.HashSet;
import java.util.Set;

public class Propietario {
    private String nombre;
    private String dni;
    private Set<Computadora> computadoras;

        public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.computadoras = new HashSet<>();
    }

    public void registrarComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
    }
        
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
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
}
