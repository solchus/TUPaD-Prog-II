package Ejercicio2;

import java.util.Objects;

public class Autor {

    private String id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int anioNacimiento;

    public Autor(String id, String nombre, String apellido, String nacionalidad, int anioNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return nombreCompleto() + " (" + nacionalidad + ", " + anioNacimiento + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Autor)) {
            return false;
        }
        Autor autor = (Autor) o;
        return Objects.equals(id, autor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
