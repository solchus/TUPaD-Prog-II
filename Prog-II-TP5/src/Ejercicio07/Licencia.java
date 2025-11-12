package Ejercicio07;

import java.time.LocalDate;

public class Licencia {
    private String nombre;
    private String dni;
    private LocalDate fechaEmision;
    private LocalDate fechaExpiracion;
    private String categoria;

    public Licencia(String nombre, String dni, LocalDate fechaEmision, 
            LocalDate fechaExpiracion, String categoria) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.categoria = categoria;
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

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Licencia{" + "nombre=" + nombre + ", dni=" + dni 
                + ", fechaEmision=" + fechaEmision + ", fechaExpiracion=" 
                + fechaExpiracion + ", categoria=" + categoria + '}';
    }
}
