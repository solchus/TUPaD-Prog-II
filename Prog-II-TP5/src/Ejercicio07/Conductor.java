package Ejercicio07;

import java.util.HashSet;
import java.util.Set;


public class Conductor {
    private String nombre;
    private Licencia licencia;
    private Set<Vehiculo> vehiculos;

    public Conductor(String nombre, Licencia licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.vehiculos = new HashSet<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Set<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia 
                + '}';
    }
    
}
