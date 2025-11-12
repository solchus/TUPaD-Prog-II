package Ejercicio01;

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private LocalDate fechaExpiracion;
    private String pais;
    private Foto foto;
    private Titular titular;

    public Pasaporte(
            String numero, 
            LocalDate fechaEmision, 
            LocalDate fechaExpiracion, 
            String pais,
            Titular titular,
            String imagen,
            String formatoImagen
    ) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.pais = pais;
        this.titular = titular;
        this.foto = new Foto(imagen, formatoImagen);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Foto getFoto() {
        return foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" 
                + fechaEmision + ", fechaExpiracion=" + fechaExpiracion 
                + ", pais=" + pais + ", titular=" + titular + ", foto="
                + foto + '}';
    }
    
}