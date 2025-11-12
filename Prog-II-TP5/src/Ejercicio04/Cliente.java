/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String dni;
    private Set<TarjetaDeCredito> tarjetas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetas = new HashSet<>();
    }

    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjetas.add(tarjeta);
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

    public Set<TarjetaDeCredito> getTarjetas() {
        return tarjetas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
